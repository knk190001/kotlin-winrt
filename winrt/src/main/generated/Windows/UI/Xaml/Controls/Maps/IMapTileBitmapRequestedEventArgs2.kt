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

@ABIMarker(IMapTileBitmapRequestedEventArgs2.ABI::class)
@Signature("{0261d114-246a-5296-bc85-590f53aa39c8}")
@Guid("0261d114246a5296bc85590f53aa39c8")
@WinRTInterface("0261d114246a5296bc85590f53aa39c8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapTileBitmapRequestedEventArgs2.ByReference::class)
public interface IMapTileBitmapRequestedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FrameIndex(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapTileBitmapRequestedEventArgs2> {
    public override fun getValue() =
        ABI.makeIMapTileBitmapRequestedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IMapTileBitmapRequestedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapTileBitmapRequestedEventArgs2 {
    public val __152454367_Ptr: Pointer?

    public val _152454367_VtblPtr: Pointer?
      get() = __152454367_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FrameIndex(): Int {
      val fnPtr = _152454367_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__152454367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IMapTileBitmapRequestedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __152454367_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapTileBitmapRequestedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0261d114246a5296bc85590f53aa39c8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapTileBitmapRequestedEventArgs2(ptr: Pointer?): WithDefault =
        IMapTileBitmapRequestedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapTileBitmapRequestedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIMapTileBitmapRequestedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IMapTileBitmapRequestedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__152454367_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapTileBitmapRequestedEventArgs2):
        Array<IMapTileBitmapRequestedEventArgs2?> = (elements as
        Array<IMapTileBitmapRequestedEventArgs2?>).castToImpl<IMapTileBitmapRequestedEventArgs2,IMapTileBitmapRequestedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapTileBitmapRequestedEventArgs2?> =
        arrayOfNulls<IMapTileBitmapRequestedEventArgs2_Impl>(size) as
        Array<IMapTileBitmapRequestedEventArgs2?>
  }
}
