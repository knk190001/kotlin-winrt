package Microsoft.UI.Content

import Microsoft.UI.Composition.Compositor
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

@ABIMarker(IContentExternalBackdropLinkStatics.ABI::class)
@Signature("{46cac6fb-bb51-510a-958d-e0eb4160f678}")
@Guid("46cac6fbbb51510a958de0eb4160f678")
@WinRTInterface("46cac6fbbb51510a958de0eb4160f678")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentExternalBackdropLinkStatics.ByReference::class)
public interface IContentExternalBackdropLinkStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(compositor: Compositor?): ContentExternalBackdropLink?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentExternalBackdropLinkStatics> {
    public override fun getValue() =
        ABI.makeIContentExternalBackdropLinkStatics(pointer.getPointer(0))

    public fun setValue(value: IContentExternalBackdropLinkStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentExternalBackdropLinkStatics {
    public val __1581933531_Ptr: Pointer?

    public val _1581933531_VtblPtr: Pointer?
      get() = __1581933531_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(compositor: Compositor?): ContentExternalBackdropLink? {
      val fnPtr = _1581933531_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentExternalBackdropLink>()
      val hr = fn.invokeHR(arrayOf(__1581933531_Ptr, marshalToNative(compositor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentExternalBackdropLink>(result.getValue())
      return resultValue
    }
  }

  public class IContentExternalBackdropLinkStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1581933531_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentExternalBackdropLinkStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("46cac6fbbb51510a958de0eb4160f678")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentExternalBackdropLinkStatics(ptr: Pointer?): WithDefault =
        IContentExternalBackdropLinkStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentExternalBackdropLinkStatics {
      val address = segment.toRawLongValue()
      return makeIContentExternalBackdropLinkStatics(Pointer(address))
    }

    public override fun toNative(obj: IContentExternalBackdropLinkStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1581933531_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentExternalBackdropLinkStatics):
        Array<IContentExternalBackdropLinkStatics?> = (elements as
        Array<IContentExternalBackdropLinkStatics?>).castToImpl<IContentExternalBackdropLinkStatics,IContentExternalBackdropLinkStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentExternalBackdropLinkStatics?> =
        arrayOfNulls<IContentExternalBackdropLinkStatics_Impl>(size) as
        Array<IContentExternalBackdropLinkStatics?>
  }
}
