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

@ABIMarker(IMapInputEventArgs.ABI::class)
@Signature("{9fc503a0-a8a2-4394-92e9-2247764f2f49}")
@Guid("9fc503a0a8a2439492e92247764f2f49")
@WinRTInterface("9fc503a0a8a2439492e92247764f2f49")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapInputEventArgs.ByReference::class)
public interface IMapInputEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Position(): Point?

  @InterfaceMethod(1)
  public fun get_Location(): Geopoint?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapInputEventArgs> {
    public override fun getValue() = ABI.makeIMapInputEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMapInputEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapInputEventArgs {
    public val __1781627592_Ptr: Pointer?

    public val _1781627592_VtblPtr: Pointer?
      get() = __1781627592_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Position(): Point? {
      val fnPtr = _1781627592_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1781627592_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Location(): Geopoint? {
      val fnPtr = _1781627592_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__1781627592_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }
  }

  public class IMapInputEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1781627592_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapInputEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9fc503a0a8a2439492e92247764f2f49")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapInputEventArgs(ptr: Pointer?): WithDefault = IMapInputEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapInputEventArgs {
      val address = segment.toRawLongValue()
      return makeIMapInputEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMapInputEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1781627592_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapInputEventArgs): Array<IMapInputEventArgs?> =
        (elements as
        Array<IMapInputEventArgs?>).castToImpl<IMapInputEventArgs,IMapInputEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapInputEventArgs?> =
        arrayOfNulls<IMapInputEventArgs_Impl>(size) as Array<IMapInputEventArgs?>
  }
}
