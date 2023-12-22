package Windows.Devices.SmartCards

import Windows.Storage.Streams.IBuffer
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmartCardTriggerDetails.ABI::class)
@Signature("{5f9bf11e-39ef-4f2b-b44f-0a9155b177bc}")
@Guid("5f9bf11e39ef4f2bb44f0a9155b177bc")
@WinRTInterface("5f9bf11e39ef4f2bb44f0a9155b177bc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardTriggerDetails.ByReference::class)
public interface ISmartCardTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TriggerType(): SmartCardTriggerType?

  @InterfaceMethod(1)
  public fun get_SourceAppletId(): IBuffer?

  @InterfaceMethod(2)
  public fun get_TriggerData(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardTriggerDetails> {
    public override fun getValue() = ABI.makeISmartCardTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: ISmartCardTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardTriggerDetails {
    public val __857491504_Ptr: Pointer?

    public val _857491504_VtblPtr: Pointer?
      get() = __857491504_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TriggerType(): SmartCardTriggerType? {
      val fnPtr = _857491504_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardTriggerType>()
      val hr = fn.invokeHR(arrayOf(__857491504_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardTriggerType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SourceAppletId(): IBuffer? {
      val fnPtr = _857491504_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__857491504_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TriggerData(): IBuffer? {
      val fnPtr = _857491504_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__857491504_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __857491504_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f9bf11e39ef4f2bb44f0a9155b177bc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardTriggerDetails(ptr: Pointer?): WithDefault =
        ISmartCardTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardTriggerDetails {
      val address = segment.toRawLongValue()
      return makeISmartCardTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__857491504_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardTriggerDetails):
        Array<ISmartCardTriggerDetails?> = (elements as
        Array<ISmartCardTriggerDetails?>).castToImpl<ISmartCardTriggerDetails,ISmartCardTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardTriggerDetails?> =
        arrayOfNulls<ISmartCardTriggerDetails_Impl>(size) as Array<ISmartCardTriggerDetails?>
  }
}
