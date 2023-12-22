package Windows.Foundation

import Windows.Foundation.IClosable.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMemoryBufferReference.ABI::class)
@Signature("{fbc4dd29-245b-11e4-af98-689423260cf8}")
@Guid("fbc4dd29245b11e4af98689423260cf8")
@WinRTInterface("fbc4dd29245b11e4af98689423260cf8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMemoryBufferReference.ByReference::class)
public interface IMemoryBufferReference : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_Capacity(): WinDef.UINT

  @InterfaceMethod(1)
  public fun add_Closed(handler: TypedEventHandler<IMemoryBufferReference?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_Closed(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMemoryBufferReference> {
    public override fun getValue() = ABI.makeIMemoryBufferReference(pointer.getPointer(0))

    public fun setValue(value: IMemoryBufferReference_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMemoryBufferReference, IClosable.WithDefault {
    public val __1398745503_Ptr: Pointer?

    public val _1398745503_VtblPtr: Pointer?
      get() = __1398745503_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Capacity(): WinDef.UINT {
      val fnPtr = _1398745503_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1398745503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun add_Closed(handler: TypedEventHandler<IMemoryBufferReference?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1398745503_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1398745503_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_Closed(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1398745503_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1398745503_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMemoryBufferReference_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1398745503_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1398745503_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMemoryBufferReference, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fbc4dd29245b11e4af98689423260cf8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMemoryBufferReference(ptr: Pointer?): WithDefault =
        IMemoryBufferReference_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMemoryBufferReference {
      val address = segment.toRawLongValue()
      return makeIMemoryBufferReference(Pointer(address))
    }

    public override fun toNative(obj: IMemoryBufferReference): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1398745503_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMemoryBufferReference): Array<IMemoryBufferReference?> =
        (elements as
        Array<IMemoryBufferReference?>).castToImpl<IMemoryBufferReference,IMemoryBufferReference_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMemoryBufferReference?> =
        arrayOfNulls<IMemoryBufferReference_Impl>(size) as Array<IMemoryBufferReference?>
  }
}
