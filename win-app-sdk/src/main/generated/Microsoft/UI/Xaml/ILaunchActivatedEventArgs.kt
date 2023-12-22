package Microsoft.UI.Xaml

import Windows.ApplicationModel.Activation.LaunchActivatedEventArgs
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

@ABIMarker(ILaunchActivatedEventArgs.ABI::class)
@Signature("{d505cea9-1bcb-5b29-a8be-944e00f06f78}")
@Guid("d505cea91bcb5b29a8be944e00f06f78")
@WinRTInterface("d505cea91bcb5b29a8be944e00f06f78")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILaunchActivatedEventArgs.ByReference::class)
public interface ILaunchActivatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Arguments(): String?

  @InterfaceMethod(1)
  public fun get_UWPLaunchActivatedEventArgs(): LaunchActivatedEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILaunchActivatedEventArgs> {
    public override fun getValue() = ABI.makeILaunchActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ILaunchActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILaunchActivatedEventArgs {
    public val __782645280_Ptr: Pointer?

    public val _782645280_VtblPtr: Pointer?
      get() = __782645280_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Arguments(): String? {
      val fnPtr = _782645280_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__782645280_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_UWPLaunchActivatedEventArgs(): LaunchActivatedEventArgs? {
      val fnPtr = _782645280_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LaunchActivatedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__782645280_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LaunchActivatedEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class ILaunchActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __782645280_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILaunchActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d505cea91bcb5b29a8be944e00f06f78")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILaunchActivatedEventArgs(ptr: Pointer?): WithDefault =
        ILaunchActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILaunchActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeILaunchActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ILaunchActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__782645280_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILaunchActivatedEventArgs):
        Array<ILaunchActivatedEventArgs?> = (elements as
        Array<ILaunchActivatedEventArgs?>).castToImpl<ILaunchActivatedEventArgs,ILaunchActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILaunchActivatedEventArgs?> =
        arrayOfNulls<ILaunchActivatedEventArgs_Impl>(size) as Array<ILaunchActivatedEventArgs?>
  }
}
