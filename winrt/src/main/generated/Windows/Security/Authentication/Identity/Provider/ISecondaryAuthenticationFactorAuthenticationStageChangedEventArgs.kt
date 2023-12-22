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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs.ABI::class)
@Signature("{d4a5ee56-7291-4073-bc1f-ccb8f5afdf96}")
@Guid("d4a5ee5672914073bc1fccb8f5afdf96")
@WinRTInterface("d4a5ee5672914073bc1fccb8f5afdf96")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs.ByReference::class)
public interface ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StageInfo(): SecondaryAuthenticationFactorAuthenticationStageInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs> {
    public override fun getValue() =
        ABI.makeISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs(pointer.getPointer(0))

    public
        fun setValue(value: ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs {
    public val __864097751_Ptr: Pointer?

    public val _864097751_VtblPtr: Pointer?
      get() = __864097751_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StageInfo(): SecondaryAuthenticationFactorAuthenticationStageInfo? {
      val fnPtr = _864097751_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SecondaryAuthenticationFactorAuthenticationStageInfo>()
      val hr = fn.invokeHR(arrayOf(__864097751_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SecondaryAuthenticationFactorAuthenticationStageInfo>(result.getValue())
      return resultValue
    }
  }

  public class ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __864097751_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs,
      MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d4a5ee5672914073bc1fccb8f5afdf96")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs(ptr: Pointer?):
        WithDefault = ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs(Pointer(address))
    }

    public override
        fun toNative(obj: ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__864097751_Ptr))
  }

  public companion object {
    public fun makeArray(vararg
        elements: ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs):
        Array<ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs?> = (elements as
        Array<ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs?>).castToImpl<ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs,ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs?> =
        arrayOfNulls<ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs_Impl>(size)
        as Array<ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs?>
  }
}
