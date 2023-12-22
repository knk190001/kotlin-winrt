package Windows.Devices.Enumeration.Pnp

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IPnpObjectStatics.ABI::class)
@Signature("{b3c32a3d-d168-4660-bbf3-a733b14b6e01}")
@Guid("b3c32a3dd1684660bbf3a733b14b6e01")
@WinRTInterface("b3c32a3dd1684660bbf3a733b14b6e01")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPnpObjectStatics.ByReference::class)
public interface IPnpObjectStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromIdAsync(
    type: PnpObjectType?,
    id: String?,
    requestedProperties: IIterable<String?>?
  ): IAsyncOperation<PnpObject?>?

  @InterfaceMethod(1)
  public fun FindAllAsync(type: PnpObjectType?, requestedProperties: IIterable<String?>?):
      IAsyncOperation<PnpObjectCollection?>?

  @InterfaceMethod(2)
  public fun FindAllAsync(
    type: PnpObjectType?,
    requestedProperties: IIterable<String?>?,
    aqsFilter: String?
  ): IAsyncOperation<PnpObjectCollection?>?

  @InterfaceMethod(3)
  public fun CreateWatcher(type: PnpObjectType?, requestedProperties: IIterable<String?>?):
      PnpObjectWatcher?

  @InterfaceMethod(4)
  public fun CreateWatcher(
    type: PnpObjectType?,
    requestedProperties: IIterable<String?>?,
    aqsFilter: String?
  ): PnpObjectWatcher?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPnpObjectStatics> {
    public override fun getValue() = ABI.makeIPnpObjectStatics(pointer.getPointer(0))

    public fun setValue(value: IPnpObjectStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPnpObjectStatics {
    public val __2098622638_Ptr: Pointer?

    public val _2098622638_VtblPtr: Pointer?
      get() = __2098622638_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromIdAsync(
      type: PnpObjectType?,
      id: String?,
      requestedProperties: IIterable<String?>?
    ): IAsyncOperation<PnpObject?>? {
      val fnPtr = _2098622638_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PnpObject?>>()
      val hr = fn.invokeHR(arrayOf(__2098622638_Ptr, marshalToNative(type), marshalToNative(id),
          marshalToNative(requestedProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PnpObject?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FindAllAsync(type: PnpObjectType?,
        requestedProperties: IIterable<String?>?): IAsyncOperation<PnpObjectCollection?>? {
      val fnPtr = _2098622638_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PnpObjectCollection?>>()
      val hr = fn.invokeHR(arrayOf(__2098622638_Ptr, marshalToNative(type),
          marshalToNative(requestedProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PnpObjectCollection?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FindAllAsync(
      type: PnpObjectType?,
      requestedProperties: IIterable<String?>?,
      aqsFilter: String?
    ): IAsyncOperation<PnpObjectCollection?>? {
      val fnPtr = _2098622638_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PnpObjectCollection?>>()
      val hr = fn.invokeHR(arrayOf(__2098622638_Ptr, marshalToNative(type),
          marshalToNative(requestedProperties), marshalToNative(aqsFilter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PnpObjectCollection?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateWatcher(type: PnpObjectType?,
        requestedProperties: IIterable<String?>?): PnpObjectWatcher? {
      val fnPtr = _2098622638_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PnpObjectWatcher>()
      val hr = fn.invokeHR(arrayOf(__2098622638_Ptr, marshalToNative(type),
          marshalToNative(requestedProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PnpObjectWatcher>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateWatcher(
      type: PnpObjectType?,
      requestedProperties: IIterable<String?>?,
      aqsFilter: String?
    ): PnpObjectWatcher? {
      val fnPtr = _2098622638_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PnpObjectWatcher>()
      val hr = fn.invokeHR(arrayOf(__2098622638_Ptr, marshalToNative(type),
          marshalToNative(requestedProperties), marshalToNative(aqsFilter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PnpObjectWatcher>(result.getValue())
      return resultValue
    }
  }

  public class IPnpObjectStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2098622638_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPnpObjectStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b3c32a3dd1684660bbf3a733b14b6e01")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPnpObjectStatics(ptr: Pointer?): WithDefault = IPnpObjectStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPnpObjectStatics {
      val address = segment.toRawLongValue()
      return makeIPnpObjectStatics(Pointer(address))
    }

    public override fun toNative(obj: IPnpObjectStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2098622638_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPnpObjectStatics): Array<IPnpObjectStatics?> = (elements
        as Array<IPnpObjectStatics?>).castToImpl<IPnpObjectStatics,IPnpObjectStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPnpObjectStatics?> =
        arrayOfNulls<IPnpObjectStatics_Impl>(size) as Array<IPnpObjectStatics?>
  }
}
