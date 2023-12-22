package Windows.UI.Input.Inking

import Windows.Foundation.Point
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInkPointFactory2.ABI::class)
@Signature("{e0145e85-daff-45f2-ad69-050d8256a209}")
@Guid("e0145e85daff45f2ad69050d8256a209")
@WinRTInterface("e0145e85daff45f2ad69050d8256a209")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkPointFactory2.ByReference::class)
public interface IInkPointFactory2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInkPointWithTiltAndTimestamp(
    position: Point?,
    pressure: Float,
    tiltX: Float,
    tiltY: Float,
    timestamp: WinDef.ULONG
  ): InkPoint?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkPointFactory2> {
    public override fun getValue() = ABI.makeIInkPointFactory2(pointer.getPointer(0))

    public fun setValue(value: IInkPointFactory2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkPointFactory2 {
    public val __1101974164_Ptr: Pointer?

    public val _1101974164_VtblPtr: Pointer?
      get() = __1101974164_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInkPointWithTiltAndTimestamp(
      position: Point?,
      pressure: Float,
      tiltX: Float,
      tiltY: Float,
      timestamp: WinDef.ULONG
    ): InkPoint? {
      val fnPtr = _1101974164_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkPoint>()
      val hr = fn.invokeHR(arrayOf(__1101974164_Ptr, marshalToNative(position), pressure, tiltX,
          tiltY, timestamp, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkPoint>(result.getValue())
      return resultValue
    }
  }

  public class IInkPointFactory2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1101974164_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkPointFactory2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e0145e85daff45f2ad69050d8256a209")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkPointFactory2(ptr: Pointer?): WithDefault = IInkPointFactory2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkPointFactory2 {
      val address = segment.toRawLongValue()
      return makeIInkPointFactory2(Pointer(address))
    }

    public override fun toNative(obj: IInkPointFactory2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1101974164_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkPointFactory2): Array<IInkPointFactory2?> = (elements
        as Array<IInkPointFactory2?>).castToImpl<IInkPointFactory2,IInkPointFactory2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkPointFactory2?> =
        arrayOfNulls<IInkPointFactory2_Impl>(size) as Array<IInkPointFactory2?>
  }
}
