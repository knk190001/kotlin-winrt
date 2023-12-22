package Windows.Devices.Display.Core

import Windows.Foundation.Collections.IIterable
import Windows.Graphics.RectInt32
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDisplayDevice2.ABI::class)
@Signature("{3fefe50c-0940-54bd-a02f-f9c7a536ad60}")
@Guid("3fefe50c094054bda02ff9c7a536ad60")
@WinRTInterface("3fefe50c094054bda02ff9c7a536ad60")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayDevice2.ByReference::class)
public interface IDisplayDevice2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateSimpleScanoutWithDirtyRectsAndOptions(
    source: DisplaySource?,
    surface: DisplaySurface?,
    subresourceIndex: WinDef.UINT,
    syncInterval: WinDef.UINT,
    dirtyRects: IIterable<RectInt32?>?,
    options: DisplayScanoutOptions?
  ): DisplayScanout?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayDevice2> {
    public override fun getValue() = ABI.makeIDisplayDevice2(pointer.getPointer(0))

    public fun setValue(value: IDisplayDevice2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayDevice2 {
    public val __1888400004_Ptr: Pointer?

    public val _1888400004_VtblPtr: Pointer?
      get() = __1888400004_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateSimpleScanoutWithDirtyRectsAndOptions(
      source: DisplaySource?,
      surface: DisplaySurface?,
      subresourceIndex: WinDef.UINT,
      syncInterval: WinDef.UINT,
      dirtyRects: IIterable<RectInt32?>?,
      options: DisplayScanoutOptions?
    ): DisplayScanout? {
      val fnPtr = _1888400004_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayScanout>()
      val hr = fn.invokeHR(arrayOf(__1888400004_Ptr, marshalToNative(source),
          marshalToNative(surface), subresourceIndex, syncInterval, marshalToNative(dirtyRects),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayScanout>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayDevice2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1888400004_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayDevice2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3fefe50c094054bda02ff9c7a536ad60")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayDevice2(ptr: Pointer?): WithDefault = IDisplayDevice2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayDevice2 {
      val address = segment.toRawLongValue()
      return makeIDisplayDevice2(Pointer(address))
    }

    public override fun toNative(obj: IDisplayDevice2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1888400004_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayDevice2): Array<IDisplayDevice2?> = (elements as
        Array<IDisplayDevice2?>).castToImpl<IDisplayDevice2,IDisplayDevice2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayDevice2?> =
        arrayOfNulls<IDisplayDevice2_Impl>(size) as Array<IDisplayDevice2?>
  }
}
