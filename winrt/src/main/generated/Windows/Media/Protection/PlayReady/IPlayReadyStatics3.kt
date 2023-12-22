package Windows.Media.Protection.PlayReady

import Windows.Media.Protection.PlayReady.IPlayReadyStatics2.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IPlayReadyStatics3.ABI::class)
@Signature("{3fa33f71-2dd3-4bed-ae49-f7148e63e710}")
@Guid("3fa33f712dd34bedae49f7148e63e710")
@WinRTInterface("3fa33f712dd34bedae49f7148e63e710")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyStatics3.ByReference::class)
public interface IPlayReadyStatics3 : NativeMapped, IWinRTInterface, IPlayReadyStatics2,
    IPlayReadyStatics {
  @InterfaceMethod(0)
  public fun get_SecureStopServiceRequestType(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun CheckSupportedHardware(hwdrmFeature: PlayReadyHardwareDRMFeatures?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyStatics3> {
    public override fun getValue() = ABI.makeIPlayReadyStatics3(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyStatics3, IPlayReadyStatics2.WithDefault,
      IPlayReadyStatics.WithDefault {
    public val __574261827_Ptr: Pointer?

    public val _574261827_VtblPtr: Pointer?
      get() = __574261827_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SecureStopServiceRequestType(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _574261827_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__574261827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CheckSupportedHardware(hwdrmFeature: PlayReadyHardwareDRMFeatures?):
        Boolean {
      val fnPtr = _574261827_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__574261827_Ptr, marshalToNative(hwdrmFeature), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPlayReadyStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPlayReadyStatics2,
      IPlayReadyStatics {
    public override val __574261826_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_574261827_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1505496080_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IPlayReadyStatics.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_574261827_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __574261827_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3fa33f712dd34bedae49f7148e63e710")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyStatics3(ptr: Pointer?): WithDefault = IPlayReadyStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyStatics3 {
      val address = segment.toRawLongValue()
      return makeIPlayReadyStatics3(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__574261827_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyStatics3): Array<IPlayReadyStatics3?> =
        (elements as
        Array<IPlayReadyStatics3?>).castToImpl<IPlayReadyStatics3,IPlayReadyStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyStatics3?> =
        arrayOfNulls<IPlayReadyStatics3_Impl>(size) as Array<IPlayReadyStatics3?>
  }
}
