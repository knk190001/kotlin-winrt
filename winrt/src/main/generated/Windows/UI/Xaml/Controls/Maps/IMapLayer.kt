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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapLayer.ABI::class)
@Signature("{6d0ff9c1-a14d-4f97-8f57-46715b57683a}")
@Guid("6d0ff9c1a14d4f978f5746715b57683a")
@WinRTInterface("6d0ff9c1a14d4f978f5746715b57683a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapLayer.ByReference::class)
public interface IMapLayer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MapTabIndex(): Int

  @InterfaceMethod(1)
  public fun put_MapTabIndex(value: Int): Unit

  @InterfaceMethod(2)
  public fun get_Visible(): Boolean

  @InterfaceMethod(3)
  public fun put_Visible(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_ZIndex(): Int

  @InterfaceMethod(5)
  public fun put_ZIndex(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapLayer> {
    public override fun getValue() = ABI.makeIMapLayer(pointer.getPointer(0))

    public fun setValue(value: IMapLayer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapLayer {
    public val __1347377754_Ptr: Pointer?

    public val _1347377754_VtblPtr: Pointer?
      get() = __1347377754_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MapTabIndex(): Int {
      val fnPtr = _1347377754_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1347377754_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_MapTabIndex(value: Int): Unit {
      val fnPtr = _1347377754_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1347377754_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Visible(): Boolean {
      val fnPtr = _1347377754_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1347377754_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Visible(value: Boolean): Unit {
      val fnPtr = _1347377754_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1347377754_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ZIndex(): Int {
      val fnPtr = _1347377754_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1347377754_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_ZIndex(value: Int): Unit {
      val fnPtr = _1347377754_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1347377754_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMapLayer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1347377754_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapLayer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6d0ff9c1a14d4f978f5746715b57683a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapLayer(ptr: Pointer?): WithDefault = IMapLayer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapLayer {
      val address = segment.toRawLongValue()
      return makeIMapLayer(Pointer(address))
    }

    public override fun toNative(obj: IMapLayer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1347377754_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapLayer): Array<IMapLayer?> = (elements as
        Array<IMapLayer?>).castToImpl<IMapLayer,IMapLayer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapLayer?> = arrayOfNulls<IMapLayer_Impl>(size)
        as Array<IMapLayer?>
  }
}
