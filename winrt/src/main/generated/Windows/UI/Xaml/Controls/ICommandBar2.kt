package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.Primitives.CommandBarTemplateSettings
import Windows.UI.Xaml.Style
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

@ABIMarker(ICommandBar2.ABI::class)
@Signature("{57662f58-5b32-475d-be64-4ca36e7b97d4}")
@Guid("57662f585b32475dbe644ca36e7b97d4")
@WinRTInterface("57662f585b32475dbe644ca36e7b97d4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBar2.ByReference::class)
public interface ICommandBar2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CommandBarOverflowPresenterStyle(): Style?

  @InterfaceMethod(1)
  public fun put_CommandBarOverflowPresenterStyle(value: Style?): Unit

  @InterfaceMethod(2)
  public fun get_CommandBarTemplateSettings(): CommandBarTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICommandBar2> {
    public override fun getValue() = ABI.makeICommandBar2(pointer.getPointer(0))

    public fun setValue(value: ICommandBar2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBar2 {
    public val __1417873714_Ptr: Pointer?

    public val _1417873714_VtblPtr: Pointer?
      get() = __1417873714_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CommandBarOverflowPresenterStyle(): Style? {
      val fnPtr = _1417873714_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__1417873714_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CommandBarOverflowPresenterStyle(value: Style?): Unit {
      val fnPtr = _1417873714_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417873714_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CommandBarTemplateSettings(): CommandBarTemplateSettings? {
      val fnPtr = _1417873714_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CommandBarTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__1417873714_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CommandBarTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class ICommandBar2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1417873714_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBar2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("57662f585b32475dbe644ca36e7b97d4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBar2(ptr: Pointer?): WithDefault = ICommandBar2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBar2 {
      val address = segment.toRawLongValue()
      return makeICommandBar2(Pointer(address))
    }

    public override fun toNative(obj: ICommandBar2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1417873714_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBar2): Array<ICommandBar2?> = (elements as
        Array<ICommandBar2?>).castToImpl<ICommandBar2,ICommandBar2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBar2?> =
        arrayOfNulls<ICommandBar2_Impl>(size) as Array<ICommandBar2?>
  }
}
