package Windows.Services.Cortana

import Windows.Foundation.Uri
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

@ABIMarker(ICortanaActionableInsightsOptions.ABI::class)
@Signature("{aac2bbcf-9782-5420-b81e-7ae56af31815}")
@Guid("aac2bbcf97825420b81e7ae56af31815")
@WinRTInterface("aac2bbcf97825420b81e7ae56af31815")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICortanaActionableInsightsOptions.ByReference::class)
public interface ICortanaActionableInsightsOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentSourceWebLink(): Uri?

  @InterfaceMethod(1)
  public fun put_ContentSourceWebLink(value: Uri?): Unit

  @InterfaceMethod(2)
  public fun get_SurroundingText(): String?

  @InterfaceMethod(3)
  public fun put_SurroundingText(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICortanaActionableInsightsOptions> {
    public override fun getValue() =
        ABI.makeICortanaActionableInsightsOptions(pointer.getPointer(0))

    public fun setValue(value: ICortanaActionableInsightsOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICortanaActionableInsightsOptions {
    public val __1309554347_Ptr: Pointer?

    public val _1309554347_VtblPtr: Pointer?
      get() = __1309554347_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentSourceWebLink(): Uri? {
      val fnPtr = _1309554347_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1309554347_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ContentSourceWebLink(value: Uri?): Unit {
      val fnPtr = _1309554347_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1309554347_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SurroundingText(): String? {
      val fnPtr = _1309554347_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1309554347_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SurroundingText(value: String?): Unit {
      val fnPtr = _1309554347_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1309554347_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICortanaActionableInsightsOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1309554347_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICortanaActionableInsightsOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aac2bbcf97825420b81e7ae56af31815")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICortanaActionableInsightsOptions(ptr: Pointer?): WithDefault =
        ICortanaActionableInsightsOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICortanaActionableInsightsOptions {
      val address = segment.toRawLongValue()
      return makeICortanaActionableInsightsOptions(Pointer(address))
    }

    public override fun toNative(obj: ICortanaActionableInsightsOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1309554347_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICortanaActionableInsightsOptions):
        Array<ICortanaActionableInsightsOptions?> = (elements as
        Array<ICortanaActionableInsightsOptions?>).castToImpl<ICortanaActionableInsightsOptions,ICortanaActionableInsightsOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICortanaActionableInsightsOptions?> =
        arrayOfNulls<ICortanaActionableInsightsOptions_Impl>(size) as
        Array<ICortanaActionableInsightsOptions?>
  }
}
