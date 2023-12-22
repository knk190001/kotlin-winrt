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

@ABIMarker(IIppResolution.ABI::class)
@Signature("{cb493f86-6bf3-56f5-86ce-263d08aead63}")
@Guid("cb493f866bf356f586ce263d08aead63")
@WinRTInterface("cb493f866bf356f586ce263d08aead63")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIppResolution.ByReference::class)
public interface IIppResolution : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Width(): Int

  @InterfaceMethod(1)
  public fun get_Height(): Int

  @InterfaceMethod(2)
  public fun get_Unit(): IppResolutionUnit?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IIppResolution>
      {
    public override fun getValue() = ABI.makeIIppResolution(pointer.getPointer(0))

    public fun setValue(value: IIppResolution_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIppResolution {
    public val __1475860769_Ptr: Pointer?

    public val _1475860769_VtblPtr: Pointer?
      get() = __1475860769_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Width(): Int {
      val fnPtr = _1475860769_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1475860769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Height(): Int {
      val fnPtr = _1475860769_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1475860769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Unit(): IppResolutionUnit? {
      val fnPtr = _1475860769_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppResolutionUnit>()
      val hr = fn.invokeHR(arrayOf(__1475860769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppResolutionUnit>(result.getValue())
      return resultValue
    }
  }

  public class IIppResolution_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1475860769_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIppResolution, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb493f866bf356f586ce263d08aead63")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIppResolution(ptr: Pointer?): WithDefault = IIppResolution_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIppResolution {
      val address = segment.toRawLongValue()
      return makeIIppResolution(Pointer(address))
    }

    public override fun toNative(obj: IIppResolution): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1475860769_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIppResolution): Array<IIppResolution?> = (elements as
        Array<IIppResolution?>).castToImpl<IIppResolution,IIppResolution_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIppResolution?> =
        arrayOfNulls<IIppResolution_Impl>(size) as Array<IIppResolution?>
  }
}
