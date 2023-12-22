package Windows.UI.ViewManagement.Core

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(ICoreFrameworkInputViewOcclusionsChangedEventArgs.ABI::class)
@Signature("{f36f4949-c82c-53d1-a75d-2b2baf0d9b0d}")
@Guid("f36f4949c82c53d1a75d2b2baf0d9b0d")
@WinRTInterface("f36f4949c82c53d1a75d2b2baf0d9b0d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreFrameworkInputViewOcclusionsChangedEventArgs.ByReference::class)
public interface ICoreFrameworkInputViewOcclusionsChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Occlusions(): IVectorView<CoreInputViewOcclusion?>?

  @InterfaceMethod(1)
  public fun get_Handled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreFrameworkInputViewOcclusionsChangedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreFrameworkInputViewOcclusionsChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreFrameworkInputViewOcclusionsChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreFrameworkInputViewOcclusionsChangedEventArgs {
    public val __1125973812_Ptr: Pointer?

    public val _1125973812_VtblPtr: Pointer?
      get() = __1125973812_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Occlusions(): IVectorView<CoreInputViewOcclusion?>? {
      val fnPtr = _1125973812_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<CoreInputViewOcclusion?>>()
      val hr = fn.invokeHR(arrayOf(__1125973812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<CoreInputViewOcclusion?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1125973812_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1125973812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreFrameworkInputViewOcclusionsChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1125973812_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreFrameworkInputViewOcclusionsChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f36f4949c82c53d1a75d2b2baf0d9b0d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreFrameworkInputViewOcclusionsChangedEventArgs(ptr: Pointer?): WithDefault =
        ICoreFrameworkInputViewOcclusionsChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreFrameworkInputViewOcclusionsChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreFrameworkInputViewOcclusionsChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreFrameworkInputViewOcclusionsChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1125973812_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreFrameworkInputViewOcclusionsChangedEventArgs):
        Array<ICoreFrameworkInputViewOcclusionsChangedEventArgs?> = (elements as
        Array<ICoreFrameworkInputViewOcclusionsChangedEventArgs?>).castToImpl<ICoreFrameworkInputViewOcclusionsChangedEventArgs,ICoreFrameworkInputViewOcclusionsChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ICoreFrameworkInputViewOcclusionsChangedEventArgs?> =
        arrayOfNulls<ICoreFrameworkInputViewOcclusionsChangedEventArgs_Impl>(size) as
        Array<ICoreFrameworkInputViewOcclusionsChangedEventArgs?>
  }
}
