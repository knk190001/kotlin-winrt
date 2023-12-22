package Microsoft.UI.Content

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

@ABIMarker(ISystemVisualSiteBridge.ABI::class)
@Signature("{6eedd227-3802-5772-b24e-1d8b736cffa7}")
@Guid("6eedd22738025772b24e1d8b736cffa7")
@WinRTInterface("6eedd22738025772b24e1d8b736cffa7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemVisualSiteBridge.ByReference::class)
public interface ISystemVisualSiteBridge : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Site(): ContentSite?

  @InterfaceMethod(1)
  public fun Connect(content: ContentIsland?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemVisualSiteBridge> {
    public override fun getValue() = ABI.makeISystemVisualSiteBridge(pointer.getPointer(0))

    public fun setValue(value: ISystemVisualSiteBridge_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemVisualSiteBridge {
    public val __946250249_Ptr: Pointer?

    public val _946250249_VtblPtr: Pointer?
      get() = __946250249_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Site(): ContentSite? {
      val fnPtr = _946250249_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentSite>()
      val hr = fn.invokeHR(arrayOf(__946250249_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentSite>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Connect(content: ContentIsland?): Unit {
      val fnPtr = _946250249_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__946250249_Ptr, marshalToNative(content),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISystemVisualSiteBridge_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __946250249_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemVisualSiteBridge, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6eedd22738025772b24e1d8b736cffa7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemVisualSiteBridge(ptr: Pointer?): WithDefault =
        ISystemVisualSiteBridge_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemVisualSiteBridge {
      val address = segment.toRawLongValue()
      return makeISystemVisualSiteBridge(Pointer(address))
    }

    public override fun toNative(obj: ISystemVisualSiteBridge): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__946250249_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemVisualSiteBridge): Array<ISystemVisualSiteBridge?>
        = (elements as
        Array<ISystemVisualSiteBridge?>).castToImpl<ISystemVisualSiteBridge,ISystemVisualSiteBridge_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemVisualSiteBridge?> =
        arrayOfNulls<ISystemVisualSiteBridge_Impl>(size) as Array<ISystemVisualSiteBridge?>
  }
}
