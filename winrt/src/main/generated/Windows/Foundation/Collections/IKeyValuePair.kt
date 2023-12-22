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
import java.lang.IllegalStateException
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@GenericType
@DynamicSignature
@ABIMarker(IKeyValuePair.ABI::class)
@Guid("02b51929c1c44a7e89400312b5c18500")
@WinRTByReference(IKeyValuePair.ByReference::class)
@TypeHash("__1684261520_Type")
public interface IKeyValuePair<K, V> : NativeMapped, IWinRTInterface {
  public val __1684261520_Ptr: Pointer?

  public val _1684261520_VtblPtr: Pointer?
    get() = __1684261520_Ptr?.getPointer(0)

  public val __1684261520_Type: KType?

  public fun get_Key(): K {
    if (__1684261520_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1684261520_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<K>(__1684261520_Type!!.arguments[0].type!!)
    val hr = fn.invokeHR(arrayOf(__1684261520_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = __1684261520_Type!!.arguments[0]
    return marshalFromNative<K>(result.getValue(), returnType.type!!)as K
  }

  public fun get_Value(): V {
    if (__1684261520_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1684261520_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<V>(__1684261520_Type!!.arguments[1].type!!)
    val hr = fn.invokeHR(arrayOf(__1684261520_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = __1684261520_Type!!.arguments[1]
    return marshalFromNative<V>(result.getValue(), returnType.type!!)as V
  }

  public class ByReference<K, V> : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyValuePair<K, V>>, ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): IKeyValuePair<K, V> = ABI.makeIKeyValuePair<K,
        V>(pointer.getPointer(0), type!!)

    public fun setValue(value: IKeyValuePair<K, V>): Unit {
      pointer = value.__1684261520_Ptr!!
    }
  }

  public class IKeyValuePairImpl<K, V>(
    ptr: JNAPointer? = NULL,
    public override var __1684261520_Type: KType? = null
  ) : PointerType(ptr), IKeyValuePair<K, V> {
    public override val __1684261520_Ptr: JNAPointer?
      get() = pointer

    public override val _1684261520_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public companion object {
      public operator fun <K, V> invoke(type: KType, ptr: JNAPointer?): IKeyValuePair<K, V> =
          IKeyValuePairImpl(ptr, type)

      public inline operator fun <reified K, reified V> invoke(ptr: JNAPointer?): IKeyValuePair<K,
          V> = IKeyValuePairImpl(typeOf<IKeyValuePair<K, V>>(),ptr)
    }
  }

  public object ABI : IParameterizedABI<IKeyValuePair<*, *>, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun <K, V> makeIKeyValuePair(ptr: JNAPointer?, type: KType) = IKeyValuePairImpl<K,
        V>(type, ptr)

    public inline fun <reified K, reified V> makeIKeyValuePair(ptr: JNAPointer?) =
        IKeyValuePairImpl.invoke<K, V>( ptr)

    public override fun fromNative(type: KType, segment: MemoryAddress): IKeyValuePair<*, *> {
      val address = segment.toRawLongValue()
      return makeIKeyValuePair<Unit, Unit>(Pointer(address), type)
    }

    public override fun toNative(obj: IKeyValuePair<*, *>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.__1684261520_Ptr))
  }
}
