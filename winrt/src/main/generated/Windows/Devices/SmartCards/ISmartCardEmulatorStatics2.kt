package Windows.Devices.SmartCards

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmartCardEmulatorStatics2.ABI::class)
@Signature("{69ae9f8a-b775-488b-8436-6c1e28ed731f}")
@Guid("69ae9f8ab775488b84366c1e28ed731f")
@WinRTInterface("69ae9f8ab775488b84366c1e28ed731f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardEmulatorStatics2.ByReference::class)
public interface ISmartCardEmulatorStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAppletIdGroupRegistrationsAsync():
      IAsyncOperation<IVectorView<SmartCardAppletIdGroupRegistration?>?>?

  @InterfaceMethod(1)
  public fun RegisterAppletIdGroupAsync(appletIdGroup: SmartCardAppletIdGroup?):
      IAsyncOperation<SmartCardAppletIdGroupRegistration?>?

  @InterfaceMethod(2)
  public fun UnregisterAppletIdGroupAsync(registration: SmartCardAppletIdGroupRegistration?):
      IAsyncAction?

  @InterfaceMethod(3)
  public fun get_MaxAppletIdGroupRegistrations(): WinDef.USHORT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardEmulatorStatics2> {
    public override fun getValue() = ABI.makeISmartCardEmulatorStatics2(pointer.getPointer(0))

    public fun setValue(value: ISmartCardEmulatorStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardEmulatorStatics2 {
    public val __683345032_Ptr: Pointer?

    public val _683345032_VtblPtr: Pointer?
      get() = __683345032_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAppletIdGroupRegistrationsAsync():
        IAsyncOperation<IVectorView<SmartCardAppletIdGroupRegistration?>?>? {
      val fnPtr = _683345032_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<IVectorView<SmartCardAppletIdGroupRegistration?>?>>()
      val hr = fn.invokeHR(arrayOf(__683345032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<SmartCardAppletIdGroupRegistration?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RegisterAppletIdGroupAsync(appletIdGroup: SmartCardAppletIdGroup?):
        IAsyncOperation<SmartCardAppletIdGroupRegistration?>? {
      val fnPtr = _683345032_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SmartCardAppletIdGroupRegistration?>>()
      val hr = fn.invokeHR(arrayOf(__683345032_Ptr, marshalToNative(appletIdGroup), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardAppletIdGroupRegistration?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override
        fun UnregisterAppletIdGroupAsync(registration: SmartCardAppletIdGroupRegistration?):
        IAsyncAction? {
      val fnPtr = _683345032_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__683345032_Ptr, marshalToNative(registration), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MaxAppletIdGroupRegistrations(): WinDef.USHORT {
      val fnPtr = _683345032_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__683345032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }
  }

  public class ISmartCardEmulatorStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __683345032_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardEmulatorStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("69ae9f8ab775488b84366c1e28ed731f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardEmulatorStatics2(ptr: Pointer?): WithDefault =
        ISmartCardEmulatorStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardEmulatorStatics2 {
      val address = segment.toRawLongValue()
      return makeISmartCardEmulatorStatics2(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardEmulatorStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__683345032_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardEmulatorStatics2):
        Array<ISmartCardEmulatorStatics2?> = (elements as
        Array<ISmartCardEmulatorStatics2?>).castToImpl<ISmartCardEmulatorStatics2,ISmartCardEmulatorStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardEmulatorStatics2?> =
        arrayOfNulls<ISmartCardEmulatorStatics2_Impl>(size) as Array<ISmartCardEmulatorStatics2?>
  }
}
