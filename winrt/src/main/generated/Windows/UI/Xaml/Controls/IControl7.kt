package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.CornerRadius
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

@ABIMarker(IControl7.ABI::class)
@Signature("{3550dbe1-e561-5934-a3ef-7db8bf6e3b45}")
@Guid("3550dbe1e5615934a3ef7db8bf6e3b45")
@WinRTInterface("3550dbe1e5615934a3ef7db8bf6e3b45")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IControl7.ByReference::class)
public interface IControl7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BackgroundSizing(): BackgroundSizing?

  @InterfaceMethod(1)
  public fun put_BackgroundSizing(value: BackgroundSizing?): Unit

  @InterfaceMethod(2)
  public fun get_CornerRadius(): CornerRadius?

  @InterfaceMethod(3)
  public fun put_CornerRadius(value: CornerRadius?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IControl7> {
    public override fun getValue() = ABI.makeIControl7(pointer.getPointer(0))

    public fun setValue(value: IControl7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IControl7 {
    public val __1055668586_Ptr: Pointer?

    public val _1055668586_VtblPtr: Pointer?
      get() = __1055668586_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BackgroundSizing(): BackgroundSizing? {
      val fnPtr = _1055668586_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundSizing>()
      val hr = fn.invokeHR(arrayOf(__1055668586_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundSizing>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_BackgroundSizing(value: BackgroundSizing?): Unit {
      val fnPtr = _1055668586_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1055668586_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CornerRadius(): CornerRadius? {
      val fnPtr = _1055668586_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CornerRadius>()
      val hr = fn.invokeHR(arrayOf(__1055668586_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CornerRadius>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CornerRadius(value: CornerRadius?): Unit {
      val fnPtr = _1055668586_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1055668586_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IControl7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1055668586_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IControl7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3550dbe1e5615934a3ef7db8bf6e3b45")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIControl7(ptr: Pointer?): WithDefault = IControl7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IControl7 {
      val address = segment.toRawLongValue()
      return makeIControl7(Pointer(address))
    }

    public override fun toNative(obj: IControl7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1055668586_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IControl7): Array<IControl7?> = (elements as
        Array<IControl7?>).castToImpl<IControl7,IControl7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IControl7?> = arrayOfNulls<IControl7_Impl>(size)
        as Array<IControl7?>
  }
}
