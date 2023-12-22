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

@ABIMarker(ICoreWindowSiteBridge.ABI::class)
@Signature("{03e1c02e-e5e3-526a-8492-939e26ee09d5}")
@Guid("03e1c02ee5e3526a8492939e26ee09d5")
@WinRTInterface("03e1c02ee5e3526a8492939e26ee09d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWindowSiteBridge.ByReference::class)
public interface ICoreWindowSiteBridge : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Connect(content: ContentIsland?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWindowSiteBridge> {
    public override fun getValue() = ABI.makeICoreWindowSiteBridge(pointer.getPointer(0))

    public fun setValue(value: ICoreWindowSiteBridge_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWindowSiteBridge {
    public val __544103081_Ptr: Pointer?

    public val _544103081_VtblPtr: Pointer?
      get() = __544103081_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Connect(content: ContentIsland?): Unit {
      val fnPtr = _544103081_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__544103081_Ptr, marshalToNative(content),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWindowSiteBridge_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __544103081_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWindowSiteBridge, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("03e1c02ee5e3526a8492939e26ee09d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWindowSiteBridge(ptr: Pointer?): WithDefault =
        ICoreWindowSiteBridge_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWindowSiteBridge {
      val address = segment.toRawLongValue()
      return makeICoreWindowSiteBridge(Pointer(address))
    }

    public override fun toNative(obj: ICoreWindowSiteBridge): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__544103081_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWindowSiteBridge): Array<ICoreWindowSiteBridge?> =
        (elements as
        Array<ICoreWindowSiteBridge?>).castToImpl<ICoreWindowSiteBridge,ICoreWindowSiteBridge_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWindowSiteBridge?> =
        arrayOfNulls<ICoreWindowSiteBridge_Impl>(size) as Array<ICoreWindowSiteBridge?>
  }
}
