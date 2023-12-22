package Windows.UI.WebUI

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

@ABIMarker(IWebUIBackgroundTaskInstance.ABI::class)
@Signature("{23f12c25-e2f7-4741-bc9c-394595de24dc}")
@Guid("23f12c25e2f74741bc9c394595de24dc")
@WinRTInterface("23f12c25e2f74741bc9c394595de24dc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUIBackgroundTaskInstance.ByReference::class)
public interface IWebUIBackgroundTaskInstance : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Succeeded(): Boolean

  @InterfaceMethod(1)
  public fun put_Succeeded(succeeded: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUIBackgroundTaskInstance> {
    public override fun getValue() = ABI.makeIWebUIBackgroundTaskInstance(pointer.getPointer(0))

    public fun setValue(value: IWebUIBackgroundTaskInstance_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUIBackgroundTaskInstance {
    public val __1981820704_Ptr: Pointer?

    public val _1981820704_VtblPtr: Pointer?
      get() = __1981820704_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Succeeded(): Boolean {
      val fnPtr = _1981820704_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1981820704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Succeeded(succeeded: Boolean): Unit {
      val fnPtr = _1981820704_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1981820704_Ptr, succeeded,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebUIBackgroundTaskInstance_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1981820704_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUIBackgroundTaskInstance, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("23f12c25e2f74741bc9c394595de24dc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUIBackgroundTaskInstance(ptr: Pointer?): WithDefault =
        IWebUIBackgroundTaskInstance_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUIBackgroundTaskInstance {
      val address = segment.toRawLongValue()
      return makeIWebUIBackgroundTaskInstance(Pointer(address))
    }

    public override fun toNative(obj: IWebUIBackgroundTaskInstance): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1981820704_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUIBackgroundTaskInstance):
        Array<IWebUIBackgroundTaskInstance?> = (elements as
        Array<IWebUIBackgroundTaskInstance?>).castToImpl<IWebUIBackgroundTaskInstance,IWebUIBackgroundTaskInstance_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUIBackgroundTaskInstance?> =
        arrayOfNulls<IWebUIBackgroundTaskInstance_Impl>(size) as
        Array<IWebUIBackgroundTaskInstance?>
  }
}
