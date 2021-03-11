package cn.edu.guet.coursetable.model;

import java.lang.System;

@androidx.room.Entity(tableName = "account")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\t\n\u0003\b\u00ad\u0001\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0005\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u00107\u001a\u000208\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010;J\f\u0010\u00ae\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00af\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00b0\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00b1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00b2\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00b3\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00b4\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00b5\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00b7\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00b8\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00b9\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00ba\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00bb\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00bc\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00bd\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00be\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00bf\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00c0\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00c1\u0001\u001a\u00020\u001eH\u00c6\u0003J\f\u0010\u00c2\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00c3\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00c4\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00c5\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00c6\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00c7\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00c8\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00c9\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00ca\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00cb\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00cc\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00cd\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00ce\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00cf\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00d0\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00d1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00d2\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00d3\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00d4\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00d5\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00d6\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00d8\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00d9\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00da\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00db\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00dc\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00dd\u0001\u001a\u000208H\u00c6\u0003J\f\u0010\u00de\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00df\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00e0\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00e1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00e2\u0001\u001a\u00020\u0003H\u00c6\u0003J\f\u0010\u00e3\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u008c\u0005\u0010\u00e4\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0016\u0010\u00e5\u0001\u001a\u00030\u00e6\u00012\t\u0010\u00e7\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00e8\u0001\u001a\u00020\u001eH\u00d6\u0001J\n\u0010\u00e9\u0001\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010)\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001c\u00103\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010=\"\u0004\bA\u0010?R\u001c\u00100\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010=\"\u0004\bC\u0010?R\u001c\u0010#\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010=\"\u0004\bE\u0010?R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010=\"\u0004\bG\u0010?R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010=\"\u0004\bI\u0010?R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010=\"\u0004\bK\u0010?R\u001c\u0010\'\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010=\"\u0004\bM\u0010?R\u001c\u0010%\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010=\"\u0004\bO\u0010?R\u001c\u00105\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010=\"\u0004\bQ\u0010?R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010=\"\u0004\bS\u0010?R\u001c\u0010(\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010=\"\u0004\bU\u0010?R\u001c\u00102\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010=\"\u0004\bW\u0010?R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010=\"\u0004\bY\u0010?R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010=\"\u0004\b[\u0010?R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010=\"\u0004\b]\u0010?R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010=\"\u0004\b_\u0010?R\u001c\u0010!\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010=\"\u0004\ba\u0010?R\u001c\u0010*\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010=\"\u0004\bc\u0010?R\u001c\u0010+\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010=\"\u0004\be\u0010?R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010=\"\u0004\bg\u0010?R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010=\"\u0004\bi\u0010?R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010=\"\u0004\bk\u0010?R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010=\"\u0004\bm\u0010?R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010=\"\u0004\bs\u0010?R\u001c\u00106\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u0010=\"\u0004\bu\u0010?R\u001c\u00101\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010=\"\u0004\bw\u0010?R\u001c\u0010.\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u0010=\"\u0004\by\u0010?R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bz\u0010=\"\u0004\b{\u0010?R\u001c\u0010$\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010=\"\u0004\b}\u0010?R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b~\u0010=\"\u0004\b\u007f\u0010?R\u001e\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010=\"\u0005\b\u0081\u0001\u0010?R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010=\"\u0005\b\u0083\u0001\u0010?R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010=\"\u0005\b\u0085\u0001\u0010?R\u001e\u0010,\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010=\"\u0005\b\u0087\u0001\u0010?R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010=\"\u0005\b\u0089\u0001\u0010?R\u001e\u00109\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010=\"\u0005\b\u008b\u0001\u0010?R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u0010=\"\u0005\b\u008d\u0001\u0010?R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010=\"\u0005\b\u008f\u0001\u0010?R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010=\"\u0005\b\u0091\u0001\u0010?R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010=\"\u0005\b\u0093\u0001\u0010?R\u001e\u0010\"\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010=\"\u0005\b\u0095\u0001\u0010?R\u001e\u0010:\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0001\u0010=\"\u0005\b\u0097\u0001\u0010?R\u001e\u0010-\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u0010=\"\u0005\b\u0099\u0001\u0010?R\u001e\u0010/\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010=\"\u0005\b\u009b\u0001\u0010?R \u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0001\u0010=\"\u0005\b\u009d\u0001\u0010?R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010=\"\u0005\b\u009f\u0001\u0010?R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a0\u0001\u0010=\"\u0005\b\u00a1\u0001\u0010?R\u001e\u0010&\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a2\u0001\u0010=\"\u0005\b\u00a3\u0001\u0010?R\u001e\u00107\u001a\u000208X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a4\u0001\u0010\u00a5\u0001\"\u0006\b\u00a6\u0001\u0010\u00a7\u0001R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a8\u0001\u0010=\"\u0005\b\u00a9\u0001\u0010?R\u001e\u00104\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00aa\u0001\u0010=\"\u0005\b\u00ab\u0001\u0010?R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ac\u0001\u0010=\"\u0005\b\u00ad\u0001\u0010?\u00a8\u0006\u00ea\u0001"}, d2 = {"Lcn/edu/guet/coursetable/model/Account;", "", "engname", "", "zsjj", "testnum", "lqtype", "nation", "hostel", "political", "stid", "ds", "chinese", "fmzjhm1", "fmzjhm2", "xjzt", "changetype", "english", "nativeplace", "changestate", "pass", "stype", "rxfs", "degree", "postcode", "fmzjlx1", "fmzjlx2", "phoneno", "enrolldate", "grade", "", "name", "name1", "familyheader", "secspno", "birthday", "maths", "classtype", "total", "classno", "direction", "address", "fmxm1", "fmxm2", "oldno", "sex", "leavedate", "spno", "addscore2", "idcard", "dossiercode", "addscore1", "xq", "comment", "hostelphone", "week", "", "password", "semester", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getAddscore1", "setAddscore1", "getAddscore2", "setAddscore2", "getBirthday", "setBirthday", "getChangestate", "setChangestate", "getChangetype", "setChangetype", "getChinese", "setChinese", "getClassno", "setClassno", "getClasstype", "setClasstype", "getComment", "setComment", "getDegree", "setDegree", "getDirection", "setDirection", "getDossiercode", "setDossiercode", "getDs", "setDs", "getEnglish", "setEnglish", "getEngname", "setEngname", "getEnrolldate", "setEnrolldate", "getFamilyheader", "setFamilyheader", "getFmxm1", "setFmxm1", "getFmxm2", "setFmxm2", "getFmzjhm1", "setFmzjhm1", "getFmzjhm2", "setFmzjhm2", "getFmzjlx1", "setFmzjlx1", "getFmzjlx2", "setFmzjlx2", "getGrade", "()I", "setGrade", "(I)V", "getHostel", "setHostel", "getHostelphone", "setHostelphone", "getIdcard", "setIdcard", "getLeavedate", "setLeavedate", "getLqtype", "setLqtype", "getMaths", "setMaths", "getName", "setName", "getName1", "setName1", "getNation", "setNation", "getNativeplace", "setNativeplace", "getOldno", "setOldno", "getPass", "setPass", "getPassword", "setPassword", "getPhoneno", "setPhoneno", "getPolitical", "setPolitical", "getPostcode", "setPostcode", "getRxfs", "setRxfs", "getSecspno", "setSecspno", "getSemester", "setSemester", "getSex", "setSex", "getSpno", "setSpno", "getStid", "setStid", "getStype", "setStype", "getTestnum", "setTestnum", "getTotal", "setTotal", "getWeek", "()J", "setWeek", "(J)V", "getXjzt", "setXjzt", "getXq", "setXq", "getZsjj", "setZsjj", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Account {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String engname;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String zsjj;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String testnum;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String lqtype;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String nation;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String hostel;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String political;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    private java.lang.String stid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String ds;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String chinese;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String fmzjhm1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String fmzjhm2;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String xjzt;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String changetype;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String english;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String nativeplace;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String changestate;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pass;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String stype;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String rxfs;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String degree;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String postcode;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String fmzjlx1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String fmzjlx2;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String phoneno;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String enrolldate;
    private int grade;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String familyheader;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String secspno;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String birthday;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String maths;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String classtype;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String total;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String classno;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String direction;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String address;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String fmxm1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String fmxm2;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String oldno;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String sex;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String leavedate;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String spno;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String addscore2;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String idcard;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String dossiercode;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String addscore1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String xq;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String comment;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String hostelphone;
    private long week;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String password;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String semester;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEngname() {
        return null;
    }
    
    public final void setEngname(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getZsjj() {
        return null;
    }
    
    public final void setZsjj(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTestnum() {
        return null;
    }
    
    public final void setTestnum(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLqtype() {
        return null;
    }
    
    public final void setLqtype(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNation() {
        return null;
    }
    
    public final void setNation(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHostel() {
        return null;
    }
    
    public final void setHostel(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPolitical() {
        return null;
    }
    
    public final void setPolitical(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStid() {
        return null;
    }
    
    public final void setStid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDs() {
        return null;
    }
    
    public final void setDs(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getChinese() {
        return null;
    }
    
    public final void setChinese(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFmzjhm1() {
        return null;
    }
    
    public final void setFmzjhm1(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFmzjhm2() {
        return null;
    }
    
    public final void setFmzjhm2(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getXjzt() {
        return null;
    }
    
    public final void setXjzt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getChangetype() {
        return null;
    }
    
    public final void setChangetype(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEnglish() {
        return null;
    }
    
    public final void setEnglish(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNativeplace() {
        return null;
    }
    
    public final void setNativeplace(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getChangestate() {
        return null;
    }
    
    public final void setChangestate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPass() {
        return null;
    }
    
    public final void setPass(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStype() {
        return null;
    }
    
    public final void setStype(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRxfs() {
        return null;
    }
    
    public final void setRxfs(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDegree() {
        return null;
    }
    
    public final void setDegree(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPostcode() {
        return null;
    }
    
    public final void setPostcode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFmzjlx1() {
        return null;
    }
    
    public final void setFmzjlx1(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFmzjlx2() {
        return null;
    }
    
    public final void setFmzjlx2(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhoneno() {
        return null;
    }
    
    public final void setPhoneno(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEnrolldate() {
        return null;
    }
    
    public final void setEnrolldate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getGrade() {
        return 0;
    }
    
    public final void setGrade(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName1() {
        return null;
    }
    
    public final void setName1(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFamilyheader() {
        return null;
    }
    
    public final void setFamilyheader(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSecspno() {
        return null;
    }
    
    public final void setSecspno(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBirthday() {
        return null;
    }
    
    public final void setBirthday(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMaths() {
        return null;
    }
    
    public final void setMaths(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClasstype() {
        return null;
    }
    
    public final void setClasstype(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotal() {
        return null;
    }
    
    public final void setTotal(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClassno() {
        return null;
    }
    
    public final void setClassno(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDirection() {
        return null;
    }
    
    public final void setDirection(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFmxm1() {
        return null;
    }
    
    public final void setFmxm1(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFmxm2() {
        return null;
    }
    
    public final void setFmxm2(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOldno() {
        return null;
    }
    
    public final void setOldno(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSex() {
        return null;
    }
    
    public final void setSex(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLeavedate() {
        return null;
    }
    
    public final void setLeavedate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSpno() {
        return null;
    }
    
    public final void setSpno(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddscore2() {
        return null;
    }
    
    public final void setAddscore2(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdcard() {
        return null;
    }
    
    public final void setIdcard(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDossiercode() {
        return null;
    }
    
    public final void setDossiercode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddscore1() {
        return null;
    }
    
    public final void setAddscore1(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getXq() {
        return null;
    }
    
    public final void setXq(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getComment() {
        return null;
    }
    
    public final void setComment(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHostelphone() {
        return null;
    }
    
    public final void setHostelphone(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final long getWeek() {
        return 0L;
    }
    
    public final void setWeek(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSemester() {
        return null;
    }
    
    public final void setSemester(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public Account(@org.jetbrains.annotations.Nullable()
    java.lang.String engname, @org.jetbrains.annotations.Nullable()
    java.lang.String zsjj, @org.jetbrains.annotations.Nullable()
    java.lang.String testnum, @org.jetbrains.annotations.Nullable()
    java.lang.String lqtype, @org.jetbrains.annotations.Nullable()
    java.lang.String nation, @org.jetbrains.annotations.Nullable()
    java.lang.String hostel, @org.jetbrains.annotations.Nullable()
    java.lang.String political, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.lang.String stid, @org.jetbrains.annotations.Nullable()
    java.lang.String ds, @org.jetbrains.annotations.Nullable()
    java.lang.String chinese, @org.jetbrains.annotations.Nullable()
    java.lang.String fmzjhm1, @org.jetbrains.annotations.Nullable()
    java.lang.String fmzjhm2, @org.jetbrains.annotations.Nullable()
    java.lang.String xjzt, @org.jetbrains.annotations.Nullable()
    java.lang.String changetype, @org.jetbrains.annotations.Nullable()
    java.lang.String english, @org.jetbrains.annotations.Nullable()
    java.lang.String nativeplace, @org.jetbrains.annotations.Nullable()
    java.lang.String changestate, @org.jetbrains.annotations.Nullable()
    java.lang.String pass, @org.jetbrains.annotations.Nullable()
    java.lang.String stype, @org.jetbrains.annotations.Nullable()
    java.lang.String rxfs, @org.jetbrains.annotations.Nullable()
    java.lang.String degree, @org.jetbrains.annotations.Nullable()
    java.lang.String postcode, @org.jetbrains.annotations.Nullable()
    java.lang.String fmzjlx1, @org.jetbrains.annotations.Nullable()
    java.lang.String fmzjlx2, @org.jetbrains.annotations.Nullable()
    java.lang.String phoneno, @org.jetbrains.annotations.Nullable()
    java.lang.String enrolldate, int grade, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String name1, @org.jetbrains.annotations.Nullable()
    java.lang.String familyheader, @org.jetbrains.annotations.Nullable()
    java.lang.String secspno, @org.jetbrains.annotations.Nullable()
    java.lang.String birthday, @org.jetbrains.annotations.Nullable()
    java.lang.String maths, @org.jetbrains.annotations.Nullable()
    java.lang.String classtype, @org.jetbrains.annotations.Nullable()
    java.lang.String total, @org.jetbrains.annotations.Nullable()
    java.lang.String classno, @org.jetbrains.annotations.Nullable()
    java.lang.String direction, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.lang.String fmxm1, @org.jetbrains.annotations.Nullable()
    java.lang.String fmxm2, @org.jetbrains.annotations.Nullable()
    java.lang.String oldno, @org.jetbrains.annotations.Nullable()
    java.lang.String sex, @org.jetbrains.annotations.Nullable()
    java.lang.String leavedate, @org.jetbrains.annotations.Nullable()
    java.lang.String spno, @org.jetbrains.annotations.Nullable()
    java.lang.String addscore2, @org.jetbrains.annotations.Nullable()
    java.lang.String idcard, @org.jetbrains.annotations.Nullable()
    java.lang.String dossiercode, @org.jetbrains.annotations.Nullable()
    java.lang.String addscore1, @org.jetbrains.annotations.Nullable()
    java.lang.String xq, @org.jetbrains.annotations.Nullable()
    java.lang.String comment, @org.jetbrains.annotations.Nullable()
    java.lang.String hostelphone, long week, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String semester) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component26() {
        return null;
    }
    
    public final int component27() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component36() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component37() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component38() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component39() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component40() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component41() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component42() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component43() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component44() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component45() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component46() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component47() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component48() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component49() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component50() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component51() {
        return null;
    }
    
    public final long component52() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component53() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component54() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.edu.guet.coursetable.model.Account copy(@org.jetbrains.annotations.Nullable()
    java.lang.String engname, @org.jetbrains.annotations.Nullable()
    java.lang.String zsjj, @org.jetbrains.annotations.Nullable()
    java.lang.String testnum, @org.jetbrains.annotations.Nullable()
    java.lang.String lqtype, @org.jetbrains.annotations.Nullable()
    java.lang.String nation, @org.jetbrains.annotations.Nullable()
    java.lang.String hostel, @org.jetbrains.annotations.Nullable()
    java.lang.String political, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.lang.String stid, @org.jetbrains.annotations.Nullable()
    java.lang.String ds, @org.jetbrains.annotations.Nullable()
    java.lang.String chinese, @org.jetbrains.annotations.Nullable()
    java.lang.String fmzjhm1, @org.jetbrains.annotations.Nullable()
    java.lang.String fmzjhm2, @org.jetbrains.annotations.Nullable()
    java.lang.String xjzt, @org.jetbrains.annotations.Nullable()
    java.lang.String changetype, @org.jetbrains.annotations.Nullable()
    java.lang.String english, @org.jetbrains.annotations.Nullable()
    java.lang.String nativeplace, @org.jetbrains.annotations.Nullable()
    java.lang.String changestate, @org.jetbrains.annotations.Nullable()
    java.lang.String pass, @org.jetbrains.annotations.Nullable()
    java.lang.String stype, @org.jetbrains.annotations.Nullable()
    java.lang.String rxfs, @org.jetbrains.annotations.Nullable()
    java.lang.String degree, @org.jetbrains.annotations.Nullable()
    java.lang.String postcode, @org.jetbrains.annotations.Nullable()
    java.lang.String fmzjlx1, @org.jetbrains.annotations.Nullable()
    java.lang.String fmzjlx2, @org.jetbrains.annotations.Nullable()
    java.lang.String phoneno, @org.jetbrains.annotations.Nullable()
    java.lang.String enrolldate, int grade, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String name1, @org.jetbrains.annotations.Nullable()
    java.lang.String familyheader, @org.jetbrains.annotations.Nullable()
    java.lang.String secspno, @org.jetbrains.annotations.Nullable()
    java.lang.String birthday, @org.jetbrains.annotations.Nullable()
    java.lang.String maths, @org.jetbrains.annotations.Nullable()
    java.lang.String classtype, @org.jetbrains.annotations.Nullable()
    java.lang.String total, @org.jetbrains.annotations.Nullable()
    java.lang.String classno, @org.jetbrains.annotations.Nullable()
    java.lang.String direction, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.lang.String fmxm1, @org.jetbrains.annotations.Nullable()
    java.lang.String fmxm2, @org.jetbrains.annotations.Nullable()
    java.lang.String oldno, @org.jetbrains.annotations.Nullable()
    java.lang.String sex, @org.jetbrains.annotations.Nullable()
    java.lang.String leavedate, @org.jetbrains.annotations.Nullable()
    java.lang.String spno, @org.jetbrains.annotations.Nullable()
    java.lang.String addscore2, @org.jetbrains.annotations.Nullable()
    java.lang.String idcard, @org.jetbrains.annotations.Nullable()
    java.lang.String dossiercode, @org.jetbrains.annotations.Nullable()
    java.lang.String addscore1, @org.jetbrains.annotations.Nullable()
    java.lang.String xq, @org.jetbrains.annotations.Nullable()
    java.lang.String comment, @org.jetbrains.annotations.Nullable()
    java.lang.String hostelphone, long week, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String semester) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}