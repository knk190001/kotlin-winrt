package Windows.Media.PlayTo

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlayToSourceWithPreferredSourceUri.ABI::class)
@Signature("{aab253eb-3301-4dc4-afba-b2f2ed9635a0}")
@Guid("aab253eb33014dc4afbab2f2ed9635a0")
@WinRTInterface("aab253eb33014dc4afbab2f2ed9635a0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayToSourceWithPreferredSourceUri.ByReference::class)
public interface IPlayToSourceWithPreferredSourceUri : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PreferredSourceUri(): Uri?

  @InterfaceMethod(1)
  public fun put_PreferredSourceUri(value: Uri?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayToSourceWithPreferredSourceUri> {
    public override fun getValue() =
        ABI.makeIPlayToSourceWithPreferredSourceUri(pointer.getPointer(0))

    public fun setValue(value: IPlayToSourceWithPreferredSourceUri_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayToSourceWithPreferredSourceUri {
    public val __239914683_Ptr: Pointer?

    public val _239914683_VtblPtr: Pointer?
      get() = __239914683_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PreferredSourceUri(): Uri? {
      val fnPtr = _239914683_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__239914683_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PreferredSourceUri(value: Uri?): Unit {
      val fnPtr = _239914683_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__239914683_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPlayToSourceWithPreferredSourceUri_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __239914683_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayToSourceWithPreferredSourceUri, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aab253eb33014dc4afbab2f2ed9635a0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayToSourceWithPreferredSourceUri(ptr: Pointer?): WithDefault =
        IPlayToSourceWithPreferredSourceUri_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayToSourceWithPreferredSourceUri {
      val address = segment.toRawLongValue()
      return makeIPlayToSourceWithPreferredSourceUri(Pointer(address))
    }

    public override fun toNative(obj: IPlayToSourceWithPreferredSourceUri): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__239914683_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayToSourceWithPreferredSourceUri):
        Array<IPlayToSourceWithPreferredSourceUri?> = (elements as
        Array<IPlayToSourceWithPreferredSourceUri?>).castToImpl<IPlayToSourceWithPreferredSourceUri,IPlayToSourceWithPreferredSourceUri_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayToSourceWithPreferredSourceUri?> =
        arrayOfNulls<IPlayToSourceWithPreferredSourceUri_Impl>(size) as
        Array<IPlayToSourceWithPreferredSourceUri?>
  }
}
