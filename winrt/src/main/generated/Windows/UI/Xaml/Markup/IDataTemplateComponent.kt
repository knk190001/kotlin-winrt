package Windows.UI.Xaml.Markup

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IDataTemplateComponent.ABI::class)
@Signature("{08429dc8-8ab0-4747-aa9a-feadfc8da8e1}")
@Guid("08429dc88ab04747aa9afeadfc8da8e1")
@WinRTInterface("08429dc88ab04747aa9afeadfc8da8e1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataTemplateComponent.ByReference::class)
public interface IDataTemplateComponent : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Recycle(): Unit

  @InterfaceMethod(1)
  public fun ProcessBindings(
    item: IUnknown?,
    itemIndex: Int,
    phase: Int,
    nextPhase: Int
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataTemplateComponent> {
    public override fun getValue() = ABI.makeIDataTemplateComponent(pointer.getPointer(0))

    public fun setValue(value: IDataTemplateComponent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataTemplateComponent {
    public val __1252630575_Ptr: Pointer?

    public val _1252630575_VtblPtr: Pointer?
      get() = __1252630575_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Recycle(): Unit {
      val fnPtr = _1252630575_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1252630575_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun ProcessBindings(
      item: IUnknown?,
      itemIndex: Int,
      phase: Int,
      nextPhase: Int
    ): Unit {
      val fnPtr = _1252630575_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1252630575_Ptr, marshalToNative(item), itemIndex, phase,
          nextPhase,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDataTemplateComponent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1252630575_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataTemplateComponent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("08429dc88ab04747aa9afeadfc8da8e1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataTemplateComponent(ptr: Pointer?): WithDefault =
        IDataTemplateComponent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataTemplateComponent {
      val address = segment.toRawLongValue()
      return makeIDataTemplateComponent(Pointer(address))
    }

    public override fun toNative(obj: IDataTemplateComponent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1252630575_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataTemplateComponent): Array<IDataTemplateComponent?> =
        (elements as
        Array<IDataTemplateComponent?>).castToImpl<IDataTemplateComponent,IDataTemplateComponent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataTemplateComponent?> =
        arrayOfNulls<IDataTemplateComponent_Impl>(size) as Array<IDataTemplateComponent?>
  }
}
