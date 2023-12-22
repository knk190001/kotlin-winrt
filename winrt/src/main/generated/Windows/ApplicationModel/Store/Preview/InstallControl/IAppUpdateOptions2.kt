package Windows.ApplicationModel.Store.Preview.InstallControl

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

@ABIMarker(IAppUpdateOptions2.ABI::class)
@Signature("{f4646e08-ed26-4bf9-9679-48f628e53df8}")
@Guid("f4646e08ed264bf9967948f628e53df8")
@WinRTInterface("f4646e08ed264bf9967948f628e53df8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppUpdateOptions2.ByReference::class)
public interface IAppUpdateOptions2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AutomaticallyDownloadAndInstallUpdateIfFound(): Boolean

  @InterfaceMethod(1)
  public fun put_AutomaticallyDownloadAndInstallUpdateIfFound(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppUpdateOptions2> {
    public override fun getValue() = ABI.makeIAppUpdateOptions2(pointer.getPointer(0))

    public fun setValue(value: IAppUpdateOptions2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppUpdateOptions2 {
    public val __839438700_Ptr: Pointer?

    public val _839438700_VtblPtr: Pointer?
      get() = __839438700_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AutomaticallyDownloadAndInstallUpdateIfFound(): Boolean {
      val fnPtr = _839438700_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__839438700_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AutomaticallyDownloadAndInstallUpdateIfFound(value: Boolean): Unit {
      val fnPtr = _839438700_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__839438700_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppUpdateOptions2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __839438700_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppUpdateOptions2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f4646e08ed264bf9967948f628e53df8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppUpdateOptions2(ptr: Pointer?): WithDefault = IAppUpdateOptions2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppUpdateOptions2 {
      val address = segment.toRawLongValue()
      return makeIAppUpdateOptions2(Pointer(address))
    }

    public override fun toNative(obj: IAppUpdateOptions2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__839438700_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppUpdateOptions2): Array<IAppUpdateOptions2?> =
        (elements as
        Array<IAppUpdateOptions2?>).castToImpl<IAppUpdateOptions2,IAppUpdateOptions2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppUpdateOptions2?> =
        arrayOfNulls<IAppUpdateOptions2_Impl>(size) as Array<IAppUpdateOptions2?>
  }
}
