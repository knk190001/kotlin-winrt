package Windows.UI.Input.Spatial

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

@ABIMarker(ISpatialRecognitionEndedEventArgs.ABI::class)
@Signature("{0e35f5cb-3f75-43f3-ac81-d1dc2df9b1fb}")
@Guid("0e35f5cb3f7543f3ac81d1dc2df9b1fb")
@WinRTInterface("0e35f5cb3f7543f3ac81d1dc2df9b1fb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialRecognitionEndedEventArgs.ByReference::class)
public interface ISpatialRecognitionEndedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InteractionSourceKind(): SpatialInteractionSourceKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialRecognitionEndedEventArgs> {
    public override fun getValue() =
        ABI.makeISpatialRecognitionEndedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpatialRecognitionEndedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialRecognitionEndedEventArgs {
    public val __572694920_Ptr: Pointer?

    public val _572694920_VtblPtr: Pointer?
      get() = __572694920_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InteractionSourceKind(): SpatialInteractionSourceKind? {
      val fnPtr = _572694920_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourceKind>()
      val hr = fn.invokeHR(arrayOf(__572694920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSourceKind>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialRecognitionEndedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __572694920_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialRecognitionEndedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e35f5cb3f7543f3ac81d1dc2df9b1fb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialRecognitionEndedEventArgs(ptr: Pointer?): WithDefault =
        ISpatialRecognitionEndedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialRecognitionEndedEventArgs {
      val address = segment.toRawLongValue()
      return makeISpatialRecognitionEndedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpatialRecognitionEndedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__572694920_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialRecognitionEndedEventArgs):
        Array<ISpatialRecognitionEndedEventArgs?> = (elements as
        Array<ISpatialRecognitionEndedEventArgs?>).castToImpl<ISpatialRecognitionEndedEventArgs,ISpatialRecognitionEndedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialRecognitionEndedEventArgs?> =
        arrayOfNulls<ISpatialRecognitionEndedEventArgs_Impl>(size) as
        Array<ISpatialRecognitionEndedEventArgs?>
  }
}
