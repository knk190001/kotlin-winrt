package Windows.Devices.HumanInterfaceDevice

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IHidBooleanControlDescription.ABI::class)
@Signature("{6196e543-29d8-4a2a-8683-849e207bbe31}")
@Guid("6196e54329d84a2a8683849e207bbe31")
@WinRTInterface("6196e54329d84a2a8683849e207bbe31")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHidBooleanControlDescription.ByReference::class)
public interface IHidBooleanControlDescription : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_ReportId(): WinDef.USHORT

  @InterfaceMethod(2)
  public fun get_ReportType(): HidReportType?

  @InterfaceMethod(3)
  public fun get_UsagePage(): WinDef.USHORT

  @InterfaceMethod(4)
  public fun get_UsageId(): WinDef.USHORT

  @InterfaceMethod(5)
  public fun get_ParentCollections(): IVectorView<HidCollection?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHidBooleanControlDescription> {
    public override fun getValue() = ABI.makeIHidBooleanControlDescription(pointer.getPointer(0))

    public fun setValue(value: IHidBooleanControlDescription_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHidBooleanControlDescription {
    public val __894711727_Ptr: Pointer?

    public val _894711727_VtblPtr: Pointer?
      get() = __894711727_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): WinDef.UINT {
      val fnPtr = _894711727_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__894711727_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ReportId(): WinDef.USHORT {
      val fnPtr = _894711727_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__894711727_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ReportType(): HidReportType? {
      val fnPtr = _894711727_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HidReportType>()
      val hr = fn.invokeHR(arrayOf(__894711727_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HidReportType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_UsagePage(): WinDef.USHORT {
      val fnPtr = _894711727_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__894711727_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_UsageId(): WinDef.USHORT {
      val fnPtr = _894711727_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__894711727_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_ParentCollections(): IVectorView<HidCollection?>? {
      val fnPtr = _894711727_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<HidCollection?>>()
      val hr = fn.invokeHR(arrayOf(__894711727_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<HidCollection?>>(result.getValue())
      return resultValue
    }
  }

  public class IHidBooleanControlDescription_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __894711727_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHidBooleanControlDescription, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6196e54329d84a2a8683849e207bbe31")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHidBooleanControlDescription(ptr: Pointer?): WithDefault =
        IHidBooleanControlDescription_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHidBooleanControlDescription {
      val address = segment.toRawLongValue()
      return makeIHidBooleanControlDescription(Pointer(address))
    }

    public override fun toNative(obj: IHidBooleanControlDescription): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__894711727_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHidBooleanControlDescription):
        Array<IHidBooleanControlDescription?> = (elements as
        Array<IHidBooleanControlDescription?>).castToImpl<IHidBooleanControlDescription,IHidBooleanControlDescription_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHidBooleanControlDescription?> =
        arrayOfNulls<IHidBooleanControlDescription_Impl>(size) as
        Array<IHidBooleanControlDescription?>
  }
}
