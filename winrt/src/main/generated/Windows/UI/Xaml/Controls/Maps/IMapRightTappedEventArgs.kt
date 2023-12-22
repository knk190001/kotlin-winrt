package Windows.UI.Xaml.Controls.Maps

import Windows.Devices.Geolocation.Geopoint
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

@ABIMarker(IMapRightTappedEventArgs.ABI::class)
@Signature("{20943171-6fe8-40a6-ad0e-297379b575a7}")
@Guid("209431716fe840a6ad0e297379b575a7")
@WinRTInterface("209431716fe840a6ad0e297379b575a7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapRightTappedEventArgs.ByReference::class)
public interface IMapRightTappedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Position(): Point?

  @InterfaceMethod(1)
  public fun get_Location(): Geopoint?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapRightTappedEventArgs> {
    public override fun getValue() = ABI.makeIMapRightTappedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMapRightTappedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapRightTappedEventArgs {
    public val __1831551674_Ptr: Pointer?

    public val _1831551674_VtblPtr: Pointer?
      get() = __1831551674_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Position(): Point? {
      val fnPtr = _1831551674_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1831551674_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Location(): Geopoint? {
      val fnPtr = _1831551674_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__1831551674_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }
  }

  public class IMapRightTappedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1831551674_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapRightTappedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("209431716fe840a6ad0e297379b575a7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapRightTappedEventArgs(ptr: Pointer?): WithDefault =
        IMapRightTappedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapRightTappedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMapRightTappedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMapRightTappedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1831551674_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapRightTappedEventArgs):
        Array<IMapRightTappedEventArgs?> = (elements as
        Array<IMapRightTappedEventArgs?>).castToImpl<IMapRightTappedEventArgs,IMapRightTappedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapRightTappedEventArgs?> =
        arrayOfNulls<IMapRightTappedEventArgs_Impl>(size) as Array<IMapRightTappedEventArgs?>
  }
}
