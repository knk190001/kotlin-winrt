package Windows.Security.Authentication.Identity.Provider

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISecondaryAuthenticationFactorAuthenticationStageInfo.ABI::class)
@Signature("{56fec28b-e8aa-4c0f-8e4c-a559e73add88}")
@Guid("56fec28be8aa4c0f8e4ca559e73add88")
@WinRTInterface("56fec28be8aa4c0f8e4ca559e73add88")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    ISecondaryAuthenticationFactorAuthenticationStageInfo.ByReference::class)
public interface ISecondaryAuthenticationFactorAuthenticationStageInfo : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Stage(): SecondaryAuthenticationFactorAuthenticationStage?

  @InterfaceMethod(1)
  public fun get_Scenario(): SecondaryAuthenticationFactorAuthenticationScenario?

  @InterfaceMethod(2)
  public fun get_DeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISecondaryAuthenticationFactorAuthenticationStageInfo> {
    public override fun getValue() =
        ABI.makeISecondaryAuthenticationFactorAuthenticationStageInfo(pointer.getPointer(0))

    public fun setValue(value: ISecondaryAuthenticationFactorAuthenticationStageInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISecondaryAuthenticationFactorAuthenticationStageInfo {
    public val __1248925076_Ptr: Pointer?

    public val _1248925076_VtblPtr: Pointer?
      get() = __1248925076_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Stage(): SecondaryAuthenticationFactorAuthenticationStage? {
      val fnPtr = _1248925076_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SecondaryAuthenticationFactorAuthenticationStage>()
      val hr = fn.invokeHR(arrayOf(__1248925076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SecondaryAuthenticationFactorAuthenticationStage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Scenario(): SecondaryAuthenticationFactorAuthenticationScenario? {
      val fnPtr = _1248925076_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SecondaryAuthenticationFactorAuthenticationScenario>()
      val hr = fn.invokeHR(arrayOf(__1248925076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SecondaryAuthenticationFactorAuthenticationScenario>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1248925076_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1248925076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ISecondaryAuthenticationFactorAuthenticationStageInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1248925076_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISecondaryAuthenticationFactorAuthenticationStageInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("56fec28be8aa4c0f8e4ca559e73add88")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISecondaryAuthenticationFactorAuthenticationStageInfo(ptr: Pointer?): WithDefault
        = ISecondaryAuthenticationFactorAuthenticationStageInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISecondaryAuthenticationFactorAuthenticationStageInfo {
      val address = segment.toRawLongValue()
      return makeISecondaryAuthenticationFactorAuthenticationStageInfo(Pointer(address))
    }

    public override fun toNative(obj: ISecondaryAuthenticationFactorAuthenticationStageInfo):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1248925076_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISecondaryAuthenticationFactorAuthenticationStageInfo):
        Array<ISecondaryAuthenticationFactorAuthenticationStageInfo?> = (elements as
        Array<ISecondaryAuthenticationFactorAuthenticationStageInfo?>).castToImpl<ISecondaryAuthenticationFactorAuthenticationStageInfo,ISecondaryAuthenticationFactorAuthenticationStageInfo_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ISecondaryAuthenticationFactorAuthenticationStageInfo?> =
        arrayOfNulls<ISecondaryAuthenticationFactorAuthenticationStageInfo_Impl>(size) as
        Array<ISecondaryAuthenticationFactorAuthenticationStageInfo?>
  }
}
