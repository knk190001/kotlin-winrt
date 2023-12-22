package Windows.Media.FaceAnalysis

import Windows.Graphics.Imaging.BitmapBounds
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

@ABIMarker(IDetectedFace.ABI::class)
@Signature("{8200d454-66bc-34df-9410-e89400195414}")
@Guid("8200d45466bc34df9410e89400195414")
@WinRTInterface("8200d45466bc34df9410e89400195414")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDetectedFace.ByReference::class)
public interface IDetectedFace : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FaceBox(): BitmapBounds?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDetectedFace>
      {
    public override fun getValue() = ABI.makeIDetectedFace(pointer.getPointer(0))

    public fun setValue(value: IDetectedFace_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDetectedFace {
    public val __810361306_Ptr: Pointer?

    public val _810361306_VtblPtr: Pointer?
      get() = __810361306_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FaceBox(): BitmapBounds? {
      val fnPtr = _810361306_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapBounds>()
      val hr = fn.invokeHR(arrayOf(__810361306_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapBounds>(result.getValue())
      return resultValue
    }
  }

  public class IDetectedFace_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __810361306_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDetectedFace, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8200d45466bc34df9410e89400195414")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDetectedFace(ptr: Pointer?): WithDefault = IDetectedFace_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDetectedFace {
      val address = segment.toRawLongValue()
      return makeIDetectedFace(Pointer(address))
    }

    public override fun toNative(obj: IDetectedFace): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__810361306_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDetectedFace): Array<IDetectedFace?> = (elements as
        Array<IDetectedFace?>).castToImpl<IDetectedFace,IDetectedFace_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDetectedFace?> =
        arrayOfNulls<IDetectedFace_Impl>(size) as Array<IDetectedFace?>
  }
}
