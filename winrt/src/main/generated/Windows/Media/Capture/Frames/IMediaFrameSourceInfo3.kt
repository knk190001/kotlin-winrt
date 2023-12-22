package Windows.Media.Capture.Frames

import Windows.Devices.Enumeration.Panel
import Windows.UI.WindowManagement.DisplayRegion
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

@ABIMarker(IMediaFrameSourceInfo3.ABI::class)
@Signature("{ca824ab6-66ea-5885-a2b6-26c0eeec3c7b}")
@Guid("ca824ab666ea5885a2b626c0eeec3c7b")
@WinRTInterface("ca824ab666ea5885a2b626c0eeec3c7b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaFrameSourceInfo3.ByReference::class)
public interface IMediaFrameSourceInfo3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetRelativePanel(displayRegion: DisplayRegion?): Panel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaFrameSourceInfo3> {
    public override fun getValue() = ABI.makeIMediaFrameSourceInfo3(pointer.getPointer(0))

    public fun setValue(value: IMediaFrameSourceInfo3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaFrameSourceInfo3 {
    public val __428795867_Ptr: Pointer?

    public val _428795867_VtblPtr: Pointer?
      get() = __428795867_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetRelativePanel(displayRegion: DisplayRegion?): Panel? {
      val fnPtr = _428795867_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Panel>()
      val hr = fn.invokeHR(arrayOf(__428795867_Ptr, marshalToNative(displayRegion), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Panel>(result.getValue())
      return resultValue
    }
  }

  public class IMediaFrameSourceInfo3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __428795867_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaFrameSourceInfo3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ca824ab666ea5885a2b626c0eeec3c7b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaFrameSourceInfo3(ptr: Pointer?): WithDefault =
        IMediaFrameSourceInfo3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaFrameSourceInfo3 {
      val address = segment.toRawLongValue()
      return makeIMediaFrameSourceInfo3(Pointer(address))
    }

    public override fun toNative(obj: IMediaFrameSourceInfo3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__428795867_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaFrameSourceInfo3): Array<IMediaFrameSourceInfo3?> =
        (elements as
        Array<IMediaFrameSourceInfo3?>).castToImpl<IMediaFrameSourceInfo3,IMediaFrameSourceInfo3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaFrameSourceInfo3?> =
        arrayOfNulls<IMediaFrameSourceInfo3_Impl>(size) as Array<IMediaFrameSourceInfo3?>
  }
}
