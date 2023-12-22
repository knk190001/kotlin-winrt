package Windows.Gaming.Input.Custom

import Windows.Gaming.Input.Custom.IGameControllerProvider.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHidGameControllerProvider.ABI::class)
@Signature("{95ce3af4-abf0-4b68-a081-3b7de73ff0e7}")
@Guid("95ce3af4abf04b68a0813b7de73ff0e7")
@WinRTInterface("95ce3af4abf04b68a0813b7de73ff0e7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHidGameControllerProvider.ByReference::class)
public interface IHidGameControllerProvider : NativeMapped, IWinRTInterface, IGameControllerProvider
    {
  @InterfaceMethod(0)
  public fun get_UsageId(): WinDef.USHORT

  @InterfaceMethod(1)
  public fun get_UsagePage(): WinDef.USHORT

  @InterfaceMethod(2)
  public fun GetFeatureReport(reportId: Byte, reportBuffer: Array<Byte>): Unit

  @InterfaceMethod(3)
  public fun SendFeatureReport(reportId: Byte, reportBuffer: Array<Byte>): Unit

  @InterfaceMethod(4)
  public fun SendOutputReport(reportId: Byte, reportBuffer: Array<Byte>): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHidGameControllerProvider> {
    public override fun getValue() = ABI.makeIHidGameControllerProvider(pointer.getPointer(0))

    public fun setValue(value: IHidGameControllerProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHidGameControllerProvider, IGameControllerProvider.WithDefault {
    public val __1774588766_Ptr: Pointer?

    public val _1774588766_VtblPtr: Pointer?
      get() = __1774588766_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UsageId(): WinDef.USHORT {
      val fnPtr = _1774588766_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1774588766_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_UsagePage(): WinDef.USHORT {
      val fnPtr = _1774588766_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1774588766_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun GetFeatureReport(reportId: Byte, reportBuffer: Array<Byte>): Unit {
      val fnPtr = _1774588766_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1774588766_Ptr, reportId,
          reportBuffer.size,marshalToNative(reportBuffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun SendFeatureReport(reportId: Byte, reportBuffer: Array<Byte>): Unit {
      val fnPtr = _1774588766_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1774588766_Ptr, reportId,
          reportBuffer.size,marshalToNative(reportBuffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun SendOutputReport(reportId: Byte, reportBuffer: Array<Byte>): Unit {
      val fnPtr = _1774588766_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1774588766_Ptr, reportId,
          reportBuffer.size,marshalToNative(reportBuffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHidGameControllerProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGameControllerProvider {
    public override val __314032447_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1774588766_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1774588766_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHidGameControllerProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("95ce3af4abf04b68a0813b7de73ff0e7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHidGameControllerProvider(ptr: Pointer?): WithDefault =
        IHidGameControllerProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHidGameControllerProvider {
      val address = segment.toRawLongValue()
      return makeIHidGameControllerProvider(Pointer(address))
    }

    public override fun toNative(obj: IHidGameControllerProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1774588766_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHidGameControllerProvider):
        Array<IHidGameControllerProvider?> = (elements as
        Array<IHidGameControllerProvider?>).castToImpl<IHidGameControllerProvider,IHidGameControllerProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHidGameControllerProvider?> =
        arrayOfNulls<IHidGameControllerProvider_Impl>(size) as Array<IHidGameControllerProvider?>
  }
}
