package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.Controls.ContainerContentChangingEventArgs
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IDataTemplateExtension.ABI::class)
@Signature("{351e63c4-8fa3-5cc3-b073-7f84baa6485d}")
@Guid("351e63c48fa35cc3b0737f84baa6485d")
@WinRTInterface("351e63c48fa35cc3b0737f84baa6485d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataTemplateExtension.ByReference::class)
public interface IDataTemplateExtension : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ResetTemplate(): Unit

  @InterfaceMethod(1)
  public fun ProcessBinding(phase: WinDef.UINT): Boolean

  @InterfaceMethod(2)
  public fun ProcessBindings(arg: ContainerContentChangingEventArgs?): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataTemplateExtension> {
    public override fun getValue() = ABI.makeIDataTemplateExtension(pointer.getPointer(0))

    public fun setValue(value: IDataTemplateExtension_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataTemplateExtension {
    public val __1636156300_Ptr: Pointer?

    public val _1636156300_VtblPtr: Pointer?
      get() = __1636156300_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ResetTemplate(): Unit {
      val fnPtr = _1636156300_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1636156300_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun ProcessBinding(phase: WinDef.UINT): Boolean {
      val fnPtr = _1636156300_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1636156300_Ptr, phase, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun ProcessBindings(arg: ContainerContentChangingEventArgs?): Int {
      val fnPtr = _1636156300_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1636156300_Ptr, marshalToNative(arg), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IDataTemplateExtension_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1636156300_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataTemplateExtension, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("351e63c48fa35cc3b0737f84baa6485d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataTemplateExtension(ptr: Pointer?): WithDefault =
        IDataTemplateExtension_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataTemplateExtension {
      val address = segment.toRawLongValue()
      return makeIDataTemplateExtension(Pointer(address))
    }

    public override fun toNative(obj: IDataTemplateExtension): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1636156300_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataTemplateExtension): Array<IDataTemplateExtension?> =
        (elements as
        Array<IDataTemplateExtension?>).castToImpl<IDataTemplateExtension,IDataTemplateExtension_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataTemplateExtension?> =
        arrayOfNulls<IDataTemplateExtension_Impl>(size) as Array<IDataTemplateExtension?>
  }
}
