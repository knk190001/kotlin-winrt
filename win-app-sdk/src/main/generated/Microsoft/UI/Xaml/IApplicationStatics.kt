package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.Controls.Primitives.ComponentResourceLocation
import Windows.Foundation.Uri
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

@ABIMarker(IApplicationStatics.ABI::class)
@Signature("{4e0d09f5-4358-512c-a987-503b52848e95}")
@Guid("4e0d09f54358512ca987503b52848e95")
@WinRTInterface("4e0d09f54358512ca987503b52848e95")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationStatics.ByReference::class)
public interface IApplicationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Current(): Application?

  @InterfaceMethod(1)
  public fun Start(callback: ApplicationInitializationCallback?): Unit

  @InterfaceMethod(2)
  public fun LoadComponent(component: IUnknown?, resourceLocator: Uri?): Unit

  @InterfaceMethod(3)
  public fun LoadComponent(
    component: IUnknown?,
    resourceLocator: Uri?,
    componentResourceLocation: ComponentResourceLocation?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationStatics> {
    public override fun getValue() = ABI.makeIApplicationStatics(pointer.getPointer(0))

    public fun setValue(value: IApplicationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationStatics {
    public val __1538051292_Ptr: Pointer?

    public val _1538051292_VtblPtr: Pointer?
      get() = __1538051292_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Current(): Application? {
      val fnPtr = _1538051292_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Application>()
      val hr = fn.invokeHR(arrayOf(__1538051292_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Application>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Start(callback: ApplicationInitializationCallback?): Unit {
      val fnPtr = _1538051292_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1538051292_Ptr, marshalToNative(callback),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun LoadComponent(component: IUnknown?, resourceLocator: Uri?): Unit {
      val fnPtr = _1538051292_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1538051292_Ptr, marshalToNative(component),
          marshalToNative(resourceLocator),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun LoadComponent(
      component: IUnknown?,
      resourceLocator: Uri?,
      componentResourceLocation: ComponentResourceLocation?
    ): Unit {
      val fnPtr = _1538051292_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1538051292_Ptr, marshalToNative(component),
          marshalToNative(resourceLocator), marshalToNative(componentResourceLocation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IApplicationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1538051292_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4e0d09f54358512ca987503b52848e95")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationStatics(ptr: Pointer?): WithDefault = IApplicationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationStatics {
      val address = segment.toRawLongValue()
      return makeIApplicationStatics(Pointer(address))
    }

    public override fun toNative(obj: IApplicationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1538051292_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationStatics): Array<IApplicationStatics?> =
        (elements as
        Array<IApplicationStatics?>).castToImpl<IApplicationStatics,IApplicationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationStatics?> =
        arrayOfNulls<IApplicationStatics_Impl>(size) as Array<IApplicationStatics?>
  }
}
