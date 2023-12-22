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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebUIBackgroundTaskInstanceStatics.ABI::class)
@Signature("{9c7a5291-19ae-4ca3-b94b-fe4ec744a740}")
@Guid("9c7a529119ae4ca3b94bfe4ec744a740")
@WinRTInterface("9c7a529119ae4ca3b94bfe4ec744a740")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUIBackgroundTaskInstanceStatics.ByReference::class)
public interface IWebUIBackgroundTaskInstanceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Current(): IWebUIBackgroundTaskInstance?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUIBackgroundTaskInstanceStatics> {
    public override fun getValue() =
        ABI.makeIWebUIBackgroundTaskInstanceStatics(pointer.getPointer(0))

    public fun setValue(value: IWebUIBackgroundTaskInstanceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUIBackgroundTaskInstanceStatics {
    public val __1419303803_Ptr: Pointer?

    public val _1419303803_VtblPtr: Pointer?
      get() = __1419303803_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Current(): IWebUIBackgroundTaskInstance? {
      val fnPtr = _1419303803_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IWebUIBackgroundTaskInstance>()
      val hr = fn.invokeHR(arrayOf(__1419303803_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IWebUIBackgroundTaskInstance>(result.getValue())
      return resultValue
    }
  }

  public class IWebUIBackgroundTaskInstanceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1419303803_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUIBackgroundTaskInstanceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9c7a529119ae4ca3b94bfe4ec744a740")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUIBackgroundTaskInstanceStatics(ptr: Pointer?): WithDefault =
        IWebUIBackgroundTaskInstanceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUIBackgroundTaskInstanceStatics {
      val address = segment.toRawLongValue()
      return makeIWebUIBackgroundTaskInstanceStatics(Pointer(address))
    }

    public override fun toNative(obj: IWebUIBackgroundTaskInstanceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1419303803_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUIBackgroundTaskInstanceStatics):
        Array<IWebUIBackgroundTaskInstanceStatics?> = (elements as
        Array<IWebUIBackgroundTaskInstanceStatics?>).castToImpl<IWebUIBackgroundTaskInstanceStatics,IWebUIBackgroundTaskInstanceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUIBackgroundTaskInstanceStatics?> =
        arrayOfNulls<IWebUIBackgroundTaskInstanceStatics_Impl>(size) as
        Array<IWebUIBackgroundTaskInstanceStatics?>
  }
}
