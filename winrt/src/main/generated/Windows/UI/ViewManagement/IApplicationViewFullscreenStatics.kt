package Windows.UI.ViewManagement

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

@ABIMarker(IApplicationViewFullscreenStatics.ABI::class)
@Signature("{bc792ebd-64fe-4b65-a0c0-901ce2b68636}")
@Guid("bc792ebd64fe4b65a0c0901ce2b68636")
@WinRTInterface("bc792ebd64fe4b65a0c0901ce2b68636")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationViewFullscreenStatics.ByReference::class)
public interface IApplicationViewFullscreenStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryUnsnapToFullscreen(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationViewFullscreenStatics> {
    public override fun getValue() =
        ABI.makeIApplicationViewFullscreenStatics(pointer.getPointer(0))

    public fun setValue(value: IApplicationViewFullscreenStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationViewFullscreenStatics {
    public val __346442375_Ptr: Pointer?

    public val _346442375_VtblPtr: Pointer?
      get() = __346442375_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryUnsnapToFullscreen(): Boolean {
      val fnPtr = _346442375_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__346442375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IApplicationViewFullscreenStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __346442375_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationViewFullscreenStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bc792ebd64fe4b65a0c0901ce2b68636")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationViewFullscreenStatics(ptr: Pointer?): WithDefault =
        IApplicationViewFullscreenStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationViewFullscreenStatics {
      val address = segment.toRawLongValue()
      return makeIApplicationViewFullscreenStatics(Pointer(address))
    }

    public override fun toNative(obj: IApplicationViewFullscreenStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__346442375_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationViewFullscreenStatics):
        Array<IApplicationViewFullscreenStatics?> = (elements as
        Array<IApplicationViewFullscreenStatics?>).castToImpl<IApplicationViewFullscreenStatics,IApplicationViewFullscreenStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationViewFullscreenStatics?> =
        arrayOfNulls<IApplicationViewFullscreenStatics_Impl>(size) as
        Array<IApplicationViewFullscreenStatics?>
  }
}
