package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapTileUriRequestedEventArgs2.ABI::class)
@Signature("{2302185d-33b5-5a55-92f5-74a86a22efa6}")
@Guid("2302185d33b55a5592f574a86a22efa6")
@WinRTInterface("2302185d33b55a5592f574a86a22efa6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapTileUriRequestedEventArgs2.ByReference::class)
public interface IMapTileUriRequestedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FrameIndex(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapTileUriRequestedEventArgs2> {
    public override fun getValue() = ABI.makeIMapTileUriRequestedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IMapTileUriRequestedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapTileUriRequestedEventArgs2 {
    public val __796597398_Ptr: Pointer?

    public val _796597398_VtblPtr: Pointer?
      get() = __796597398_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FrameIndex(): Int {
      val fnPtr = _796597398_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__796597398_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IMapTileUriRequestedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __796597398_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapTileUriRequestedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2302185d33b55a5592f574a86a22efa6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapTileUriRequestedEventArgs2(ptr: Pointer?): WithDefault =
        IMapTileUriRequestedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapTileUriRequestedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIMapTileUriRequestedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IMapTileUriRequestedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__796597398_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapTileUriRequestedEventArgs2):
        Array<IMapTileUriRequestedEventArgs2?> = (elements as
        Array<IMapTileUriRequestedEventArgs2?>).castToImpl<IMapTileUriRequestedEventArgs2,IMapTileUriRequestedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapTileUriRequestedEventArgs2?> =
        arrayOfNulls<IMapTileUriRequestedEventArgs2_Impl>(size) as
        Array<IMapTileUriRequestedEventArgs2?>
  }
}
