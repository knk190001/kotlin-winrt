package Windows.ApplicationModel.Calls.Background

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneLineChangedTriggerDetails.ABI::class)
@Signature("{c6d321e7-d11d-40d8-b2b7-e40a01d66249}")
@Guid("c6d321e7d11d40d8b2b7e40a01d66249")
@WinRTInterface("c6d321e7d11d40d8b2b7e40a01d66249")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneLineChangedTriggerDetails.ByReference::class)
public interface IPhoneLineChangedTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LineId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_ChangeType(): PhoneLineChangeKind?

  @InterfaceMethod(2)
  public fun HasLinePropertyChanged(lineProperty: PhoneLineProperties?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneLineChangedTriggerDetails> {
    public override fun getValue() = ABI.makeIPhoneLineChangedTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IPhoneLineChangedTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneLineChangedTriggerDetails {
    public val __11612012_Ptr: Pointer?

    public val _11612012_VtblPtr: Pointer?
      get() = __11612012_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LineId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _11612012_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__11612012_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ChangeType(): PhoneLineChangeKind? {
      val fnPtr = _11612012_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneLineChangeKind>()
      val hr = fn.invokeHR(arrayOf(__11612012_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneLineChangeKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun HasLinePropertyChanged(lineProperty: PhoneLineProperties?): Boolean {
      val fnPtr = _11612012_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__11612012_Ptr, marshalToNative(lineProperty), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPhoneLineChangedTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __11612012_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneLineChangedTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c6d321e7d11d40d8b2b7e40a01d66249")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneLineChangedTriggerDetails(ptr: Pointer?): WithDefault =
        IPhoneLineChangedTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneLineChangedTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIPhoneLineChangedTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IPhoneLineChangedTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__11612012_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneLineChangedTriggerDetails):
        Array<IPhoneLineChangedTriggerDetails?> = (elements as
        Array<IPhoneLineChangedTriggerDetails?>).castToImpl<IPhoneLineChangedTriggerDetails,IPhoneLineChangedTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneLineChangedTriggerDetails?> =
        arrayOfNulls<IPhoneLineChangedTriggerDetails_Impl>(size) as
        Array<IPhoneLineChangedTriggerDetails?>
  }
}
