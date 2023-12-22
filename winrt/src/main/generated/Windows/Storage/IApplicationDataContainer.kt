package Windows.Storage

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.Collections.IPropertySet
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IApplicationDataContainer.ABI::class)
@Signature("{c5aefd1e-f467-40ba-8566-ab640a441e1d}")
@Guid("c5aefd1ef46740ba8566ab640a441e1d")
@WinRTInterface("c5aefd1ef46740ba8566ab640a441e1d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationDataContainer.ByReference::class)
public interface IApplicationDataContainer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_Locality(): ApplicationDataLocality?

  @InterfaceMethod(2)
  public fun get_Values(): IPropertySet?

  @InterfaceMethod(3)
  public fun get_Containers(): IMapView<String?, ApplicationDataContainer?>?

  @InterfaceMethod(4)
  public fun CreateContainer(name: String?, disposition: ApplicationDataCreateDisposition?):
      ApplicationDataContainer?

  @InterfaceMethod(5)
  public fun DeleteContainer(name: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationDataContainer> {
    public override fun getValue() = ABI.makeIApplicationDataContainer(pointer.getPointer(0))

    public fun setValue(value: IApplicationDataContainer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationDataContainer {
    public val __1143568928_Ptr: Pointer?

    public val _1143568928_VtblPtr: Pointer?
      get() = __1143568928_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _1143568928_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1143568928_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Locality(): ApplicationDataLocality? {
      val fnPtr = _1143568928_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ApplicationDataLocality>()
      val hr = fn.invokeHR(arrayOf(__1143568928_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ApplicationDataLocality>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Values(): IPropertySet? {
      val fnPtr = _1143568928_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPropertySet>()
      val hr = fn.invokeHR(arrayOf(__1143568928_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPropertySet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Containers(): IMapView<String?, ApplicationDataContainer?>? {
      val fnPtr = _1143568928_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, ApplicationDataContainer?>>()
      val hr = fn.invokeHR(arrayOf(__1143568928_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?,
          ApplicationDataContainer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateContainer(name: String?,
        disposition: ApplicationDataCreateDisposition?): ApplicationDataContainer? {
      val fnPtr = _1143568928_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ApplicationDataContainer>()
      val hr = fn.invokeHR(arrayOf(__1143568928_Ptr, marshalToNative(name),
          marshalToNative(disposition), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ApplicationDataContainer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun DeleteContainer(name: String?): Unit {
      val fnPtr = _1143568928_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1143568928_Ptr, marshalToNative(name),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IApplicationDataContainer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1143568928_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationDataContainer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c5aefd1ef46740ba8566ab640a441e1d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationDataContainer(ptr: Pointer?): WithDefault =
        IApplicationDataContainer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationDataContainer {
      val address = segment.toRawLongValue()
      return makeIApplicationDataContainer(Pointer(address))
    }

    public override fun toNative(obj: IApplicationDataContainer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1143568928_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationDataContainer):
        Array<IApplicationDataContainer?> = (elements as
        Array<IApplicationDataContainer?>).castToImpl<IApplicationDataContainer,IApplicationDataContainer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationDataContainer?> =
        arrayOfNulls<IApplicationDataContainer_Impl>(size) as Array<IApplicationDataContainer?>
  }
}
