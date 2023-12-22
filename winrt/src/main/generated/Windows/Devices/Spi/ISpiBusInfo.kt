package Windows.Devices.Spi

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(ISpiBusInfo.ABI::class)
@Signature("{9929444a-54f2-48c6-b952-9c32fc02c669}")
@Guid("9929444a54f248c6b9529c32fc02c669")
@WinRTInterface("9929444a54f248c6b9529c32fc02c669")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpiBusInfo.ByReference::class)
public interface ISpiBusInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChipSelectLineCount(): Int

  @InterfaceMethod(1)
  public fun get_MinClockFrequency(): Int

  @InterfaceMethod(2)
  public fun get_MaxClockFrequency(): Int

  @InterfaceMethod(3)
  public fun get_SupportedDataBitLengths(): IVectorView<Int>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISpiBusInfo> {
    public override fun getValue() = ABI.makeISpiBusInfo(pointer.getPointer(0))

    public fun setValue(value: ISpiBusInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpiBusInfo {
    public val __1205520731_Ptr: Pointer?

    public val _1205520731_VtblPtr: Pointer?
      get() = __1205520731_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChipSelectLineCount(): Int {
      val fnPtr = _1205520731_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1205520731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_MinClockFrequency(): Int {
      val fnPtr = _1205520731_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1205520731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MaxClockFrequency(): Int {
      val fnPtr = _1205520731_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1205520731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_SupportedDataBitLengths(): IVectorView<Int>? {
      val fnPtr = _1205520731_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Int>>()
      val hr = fn.invokeHR(arrayOf(__1205520731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Int>>(result.getValue())
      return resultValue
    }
  }

  public class ISpiBusInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1205520731_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpiBusInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9929444a54f248c6b9529c32fc02c669")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpiBusInfo(ptr: Pointer?): WithDefault = ISpiBusInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpiBusInfo {
      val address = segment.toRawLongValue()
      return makeISpiBusInfo(Pointer(address))
    }

    public override fun toNative(obj: ISpiBusInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1205520731_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpiBusInfo): Array<ISpiBusInfo?> = (elements as
        Array<ISpiBusInfo?>).castToImpl<ISpiBusInfo,ISpiBusInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpiBusInfo?> =
        arrayOfNulls<ISpiBusInfo_Impl>(size) as Array<ISpiBusInfo?>
  }
}
