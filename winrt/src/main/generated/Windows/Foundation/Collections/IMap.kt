package Windows.Foundation.Collections

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.DynamicSignature
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.TypeHash
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IParameterizedABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.ISpecializable
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.IllegalStateException
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance.INVARIANT
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@GenericType
@DynamicSignature
@ABIMarker(IMap.ABI::class)
@Guid("3c2925fe851945c1aa79197b6718c1c1")
@WinRTByReference(IMap.ByReference::class)
@TypeHash("__8028824_Type")
public interface IMap<K, V> : NativeMapped, IWinRTInterface, IIterable<IKeyValuePair<K, V>?> {
  public val __8028824_Ptr: Pointer?

  public val _8028824_VtblPtr: Pointer?
    get() = __8028824_Ptr?.getPointer(0)

  public val __8028824_Type: KType?

  public override val __1449643190_Type: KType
    get() = IIterable::class.createType(listOf(
      KTypeProjection(INVARIANT,IKeyValuePair::class.createType(listOf(
        __8028824_Type!!.arguments[0],
        __8028824_Type!!.arguments[1],
      ))),
    ))

  public fun Lookup(key: K): V {
    if (__8028824_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _8028824_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<V>(__8028824_Type!!.arguments[1].type!!)
    val hr =
        fn.invokeHR(arrayOf(__8028824_Ptr,marshalToNative(key,__8028824_Type!!.arguments[0].type!!),result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = __8028824_Type!!.arguments[1]
    return marshalFromNative<V>(result.getValue(), returnType.type!!)as V
  }

  public fun get_Size(): WinDef.UINT {
    if (__8028824_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _8028824_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<WinDef.UINT>()
    val hr = fn.invokeHR(arrayOf(__8028824_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = WinDef.UINT::class.createType()
    return marshalFromNative<WinDef.UINT>(result.getValue(), returnType!!)!!
  }

  public fun HasKey(key: K): Boolean {
    if (__8028824_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _8028824_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<Boolean>()
    val hr =
        fn.invokeHR(arrayOf(__8028824_Ptr,marshalToNative(key,__8028824_Type!!.arguments[0].type!!),result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = Boolean::class.createType()
    return marshalFromNative<Boolean>(result.getValue(), returnType!!)!!
  }

  public fun GetView(): IMapView<K, V>? {
    if (__8028824_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _8028824_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<IMapView<K, V>>(
    IMapView::class.createType(listOf(
      __8028824_Type!!.arguments[0],
      __8028824_Type!!.arguments[1],
    )))
    val hr = fn.invokeHR(arrayOf(__8028824_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = IMapView::class.createType(listOf(
      __8028824_Type!!.arguments[0],
      __8028824_Type!!.arguments[1],
    ))
    return marshalFromNative<IMapView<K, V>>(result.getValue(), returnType!!)
  }

  public fun Insert(key: K, value: V): Boolean {
    if (__8028824_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _8028824_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<Boolean>()
    val hr =
        fn.invokeHR(arrayOf(__8028824_Ptr,marshalToNative(key,__8028824_Type!!.arguments[0].type!!),
        marshalToNative(value,__8028824_Type!!.arguments[1].type!!),result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = Boolean::class.createType()
    return marshalFromNative<Boolean>(result.getValue(), returnType!!)!!
  }

  public fun Remove(key: K): Unit {
    if (__8028824_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _8028824_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val hr =
        fn.invokeHR(arrayOf(__8028824_Ptr,marshalToNative(key,__8028824_Type!!.arguments[0].type!!)))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun Clear(): Unit {
    if (__8028824_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _8028824_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val hr = fn.invokeHR(arrayOf(__8028824_Ptr,))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference<K, V> : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMap<K,
      V>>, ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): IMap<K, V> = ABI.makeIMap<K, V>(pointer.getPointer(0), type!!)

    public fun setValue(value: IMap<K, V>): Unit {
      pointer = value.__8028824_Ptr!!
    }
  }

  public class IMapImpl<K, V>(
    ptr: JNAPointer? = NULL,
    public override var __8028824_Type: KType? = null
  ) : PointerType(ptr), IMap<K, V> {
    public override val __8028824_Ptr: JNAPointer?
      get() = pointer

    public override val _8028824_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __1449643190_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf(__1449643190_Type))
      val result = PointerByReference()
      IUnknownVtbl(_8028824_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun <K, V> invoke(type: KType, ptr: JNAPointer?): IMap<K, V> = IMapImpl(ptr,
          type)

      public inline operator fun <reified K, reified V> invoke(ptr: JNAPointer?): IMap<K, V> =
          IMapImpl(typeOf<IMap<K, V>>(),ptr)
    }
  }

  public object ABI : IParameterizedABI<IMap<*, *>, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun <K, V> makeIMap(ptr: JNAPointer?, type: KType) = IMapImpl<K, V>(type, ptr)

    public inline fun <reified K, reified V> makeIMap(ptr: JNAPointer?) = IMapImpl.invoke<K, V>(
        ptr)

    public override fun fromNative(type: KType, segment: MemoryAddress): IMap<*, *> {
      val address = segment.toRawLongValue()
      return makeIMap<Unit, Unit>(Pointer(address), type)
    }

    public override fun toNative(obj: IMap<*, *>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.__8028824_Ptr))
  }
}
