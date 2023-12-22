package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.GridLength
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRowDefinition.ABI::class)
@Signature("{4abae829-d80c-4a5e-a48c-f8b3d3b6533d}")
@Guid("4abae829d80c4a5ea48cf8b3d3b6533d")
@WinRTInterface("4abae829d80c4a5ea48cf8b3d3b6533d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRowDefinition.ByReference::class)
public interface IRowDefinition : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Height(): GridLength?

  @InterfaceMethod(1)
  public fun put_Height(value: GridLength?): Unit

  @InterfaceMethod(2)
  public fun get_MaxHeight(): Double

  @InterfaceMethod(3)
  public fun put_MaxHeight(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_MinHeight(): Double

  @InterfaceMethod(5)
  public fun put_MinHeight(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_ActualHeight(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRowDefinition>
      {
    public override fun getValue() = ABI.makeIRowDefinition(pointer.getPointer(0))

    public fun setValue(value: IRowDefinition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRowDefinition {
    public val __788335567_Ptr: Pointer?

    public val _788335567_VtblPtr: Pointer?
      get() = __788335567_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Height(): GridLength? {
      val fnPtr = _788335567_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GridLength>()
      val hr = fn.invokeHR(arrayOf(__788335567_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GridLength>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Height(value: GridLength?): Unit {
      val fnPtr = _788335567_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__788335567_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MaxHeight(): Double {
      val fnPtr = _788335567_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__788335567_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_MaxHeight(value: Double): Unit {
      val fnPtr = _788335567_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__788335567_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MinHeight(): Double {
      val fnPtr = _788335567_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__788335567_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_MinHeight(value: Double): Unit {
      val fnPtr = _788335567_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__788335567_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ActualHeight(): Double {
      val fnPtr = _788335567_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__788335567_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IRowDefinition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __788335567_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRowDefinition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4abae829d80c4a5ea48cf8b3d3b6533d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRowDefinition(ptr: Pointer?): WithDefault = IRowDefinition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRowDefinition {
      val address = segment.toRawLongValue()
      return makeIRowDefinition(Pointer(address))
    }

    public override fun toNative(obj: IRowDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__788335567_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRowDefinition): Array<IRowDefinition?> = (elements as
        Array<IRowDefinition?>).castToImpl<IRowDefinition,IRowDefinition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRowDefinition?> =
        arrayOfNulls<IRowDefinition_Impl>(size) as Array<IRowDefinition?>
  }
}
