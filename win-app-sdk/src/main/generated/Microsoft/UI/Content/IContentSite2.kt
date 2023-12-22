package Microsoft.UI.Content

import Microsoft.UI.Composition.Compositor
import Microsoft.UI.Composition.Visual
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IContentSite2.ABI::class)
@Signature("{ade88c54-1da3-5520-9449-0ac7a3c01dd1}")
@Guid("ade88c541da3552094490ac7a3c01dd1")
@WinRTInterface("ade88c541da3552094490ac7a3c01dd1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentSite2.ByReference::class)
public interface IContentSite2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Compositor(): Compositor?

  @InterfaceMethod(1)
  public fun get_SiteVisual(): Visual?

  @InterfaceMethod(2)
  public fun SetContentNodeParent(value: IContentNodeOwner?): Unit

  @InterfaceMethod(3)
  public fun TryGetAutomationProvider(provider: IUnknown?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContentSite2>
      {
    public override fun getValue() = ABI.makeIContentSite2(pointer.getPointer(0))

    public fun setValue(value: IContentSite2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentSite2 {
    public val __946204156_Ptr: Pointer?

    public val _946204156_VtblPtr: Pointer?
      get() = __946204156_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Compositor(): Compositor? {
      val fnPtr = _946204156_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Compositor>()
      val hr = fn.invokeHR(arrayOf(__946204156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Compositor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SiteVisual(): Visual? {
      val fnPtr = _946204156_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visual>()
      val hr = fn.invokeHR(arrayOf(__946204156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetContentNodeParent(value: IContentNodeOwner?): Unit {
      val fnPtr = _946204156_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__946204156_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun TryGetAutomationProvider(provider: IUnknown?): Boolean {
      val fnPtr = _946204156_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__946204156_Ptr, marshalToNative(provider), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IContentSite2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __946204156_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentSite2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ade88c541da3552094490ac7a3c01dd1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentSite2(ptr: Pointer?): WithDefault = IContentSite2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentSite2 {
      val address = segment.toRawLongValue()
      return makeIContentSite2(Pointer(address))
    }

    public override fun toNative(obj: IContentSite2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__946204156_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentSite2): Array<IContentSite2?> = (elements as
        Array<IContentSite2?>).castToImpl<IContentSite2,IContentSite2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentSite2?> =
        arrayOfNulls<IContentSite2_Impl>(size) as Array<IContentSite2?>
  }
}
