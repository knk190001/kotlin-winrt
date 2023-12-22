package Windows.Devices.SmartCards

import Windows.Foundation.Collections.IVector
import Windows.Storage.Streams.IBuffer
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmartCardAppletIdGroup.ABI::class)
@Signature("{7db165e6-6264-56f4-5e03-c86385395eb1}")
@Guid("7db165e6626456f45e03c86385395eb1")
@WinRTInterface("7db165e6626456f45e03c86385395eb1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardAppletIdGroup.ByReference::class)
public interface ISmartCardAppletIdGroup : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayName(): String?

  @InterfaceMethod(1)
  public fun put_DisplayName(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_AppletIds(): IVector<IBuffer?>?

  @InterfaceMethod(3)
  public fun get_SmartCardEmulationCategory(): SmartCardEmulationCategory?

  @InterfaceMethod(4)
  public fun put_SmartCardEmulationCategory(value: SmartCardEmulationCategory?): Unit

  @InterfaceMethod(5)
  public fun get_SmartCardEmulationType(): SmartCardEmulationType?

  @InterfaceMethod(6)
  public fun put_SmartCardEmulationType(value: SmartCardEmulationType?): Unit

  @InterfaceMethod(7)
  public fun get_AutomaticEnablement(): Boolean

  @InterfaceMethod(8)
  public fun put_AutomaticEnablement(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardAppletIdGroup> {
    public override fun getValue() = ABI.makeISmartCardAppletIdGroup(pointer.getPointer(0))

    public fun setValue(value: ISmartCardAppletIdGroup_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardAppletIdGroup {
    public val __1558021348_Ptr: Pointer?

    public val _1558021348_VtblPtr: Pointer?
      get() = __1558021348_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1558021348_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1558021348_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DisplayName(value: String?): Unit {
      val fnPtr = _1558021348_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1558021348_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AppletIds(): IVector<IBuffer?>? {
      val fnPtr = _1558021348_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__1558021348_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IBuffer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SmartCardEmulationCategory(): SmartCardEmulationCategory? {
      val fnPtr = _1558021348_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardEmulationCategory>()
      val hr = fn.invokeHR(arrayOf(__1558021348_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardEmulationCategory>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_SmartCardEmulationCategory(value: SmartCardEmulationCategory?): Unit {
      val fnPtr = _1558021348_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1558021348_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_SmartCardEmulationType(): SmartCardEmulationType? {
      val fnPtr = _1558021348_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardEmulationType>()
      val hr = fn.invokeHR(arrayOf(__1558021348_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardEmulationType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_SmartCardEmulationType(value: SmartCardEmulationType?): Unit {
      val fnPtr = _1558021348_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1558021348_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_AutomaticEnablement(): Boolean {
      val fnPtr = _1558021348_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1558021348_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_AutomaticEnablement(value: Boolean): Unit {
      val fnPtr = _1558021348_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1558021348_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISmartCardAppletIdGroup_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1558021348_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardAppletIdGroup, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7db165e6626456f45e03c86385395eb1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardAppletIdGroup(ptr: Pointer?): WithDefault =
        ISmartCardAppletIdGroup_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardAppletIdGroup {
      val address = segment.toRawLongValue()
      return makeISmartCardAppletIdGroup(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardAppletIdGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1558021348_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardAppletIdGroup): Array<ISmartCardAppletIdGroup?>
        = (elements as
        Array<ISmartCardAppletIdGroup?>).castToImpl<ISmartCardAppletIdGroup,ISmartCardAppletIdGroup_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardAppletIdGroup?> =
        arrayOfNulls<ISmartCardAppletIdGroup_Impl>(size) as Array<ISmartCardAppletIdGroup?>
  }
}
