package Windows.Devices.Printers

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

@ABIMarker(IIppIntegerRangeFactory.ABI::class)
@Signature("{75d4ecae-f87e-54ad-b5d0-465204db7553}")
@Guid("75d4ecaef87e54adb5d0465204db7553")
@WinRTInterface("75d4ecaef87e54adb5d0465204db7553")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIppIntegerRangeFactory.ByReference::class)
public interface IIppIntegerRangeFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(start: Int, end: Int): IppIntegerRange?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIppIntegerRangeFactory> {
    public override fun getValue() = ABI.makeIIppIntegerRangeFactory(pointer.getPointer(0))

    public fun setValue(value: IIppIntegerRangeFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIppIntegerRangeFactory {
    public val __817996650_Ptr: Pointer?

    public val _817996650_VtblPtr: Pointer?
      get() = __817996650_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(start: Int, end: Int): IppIntegerRange? {
      val fnPtr = _817996650_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppIntegerRange>()
      val hr = fn.invokeHR(arrayOf(__817996650_Ptr, start, end, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppIntegerRange>(result.getValue())
      return resultValue
    }
  }

  public class IIppIntegerRangeFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __817996650_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIppIntegerRangeFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("75d4ecaef87e54adb5d0465204db7553")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIppIntegerRangeFactory(ptr: Pointer?): WithDefault =
        IIppIntegerRangeFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIppIntegerRangeFactory {
      val address = segment.toRawLongValue()
      return makeIIppIntegerRangeFactory(Pointer(address))
    }

    public override fun toNative(obj: IIppIntegerRangeFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__817996650_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIppIntegerRangeFactory): Array<IIppIntegerRangeFactory?>
        = (elements as
        Array<IIppIntegerRangeFactory?>).castToImpl<IIppIntegerRangeFactory,IIppIntegerRangeFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIppIntegerRangeFactory?> =
        arrayOfNulls<IIppIntegerRangeFactory_Impl>(size) as Array<IIppIntegerRangeFactory?>
  }
}
