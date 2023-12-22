package Windows.Networking.Connectivity

import Windows.Foundation.IReference
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IConnectionProfileFilter2.ABI::class)
@Signature("{cd068ee1-c3fc-4fad-9ddc-593faa4b7885}")
@Guid("cd068ee1c3fc4fad9ddc593faa4b7885")
@WinRTInterface("cd068ee1c3fc4fad9ddc593faa4b7885")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConnectionProfileFilter2.ByReference::class)
public interface IConnectionProfileFilter2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_IsRoaming(value: IReference<Boolean>?): Unit

  @InterfaceMethod(1)
  public fun get_IsRoaming(): IReference<Boolean>?

  @InterfaceMethod(2)
  public fun put_IsOverDataLimit(value: IReference<Boolean>?): Unit

  @InterfaceMethod(3)
  public fun get_IsOverDataLimit(): IReference<Boolean>?

  @InterfaceMethod(4)
  public fun put_IsBackgroundDataUsageRestricted(value: IReference<Boolean>?): Unit

  @InterfaceMethod(5)
  public fun get_IsBackgroundDataUsageRestricted(): IReference<Boolean>?

  @InterfaceMethod(6)
  public fun get_RawData(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConnectionProfileFilter2> {
    public override fun getValue() = ABI.makeIConnectionProfileFilter2(pointer.getPointer(0))

    public fun setValue(value: IConnectionProfileFilter2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConnectionProfileFilter2 {
    public val __770495634_Ptr: Pointer?

    public val _770495634_VtblPtr: Pointer?
      get() = __770495634_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_IsRoaming(value: IReference<Boolean>?): Unit {
      val fnPtr = _770495634_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__770495634_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_IsRoaming(): IReference<Boolean>? {
      val fnPtr = _770495634_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__770495634_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_IsOverDataLimit(value: IReference<Boolean>?): Unit {
      val fnPtr = _770495634_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__770495634_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsOverDataLimit(): IReference<Boolean>? {
      val fnPtr = _770495634_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__770495634_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_IsBackgroundDataUsageRestricted(value: IReference<Boolean>?): Unit {
      val fnPtr = _770495634_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__770495634_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_IsBackgroundDataUsageRestricted(): IReference<Boolean>? {
      val fnPtr = _770495634_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__770495634_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_RawData(): IBuffer? {
      val fnPtr = _770495634_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__770495634_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IConnectionProfileFilter2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __770495634_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConnectionProfileFilter2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cd068ee1c3fc4fad9ddc593faa4b7885")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConnectionProfileFilter2(ptr: Pointer?): WithDefault =
        IConnectionProfileFilter2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConnectionProfileFilter2 {
      val address = segment.toRawLongValue()
      return makeIConnectionProfileFilter2(Pointer(address))
    }

    public override fun toNative(obj: IConnectionProfileFilter2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__770495634_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConnectionProfileFilter2):
        Array<IConnectionProfileFilter2?> = (elements as
        Array<IConnectionProfileFilter2?>).castToImpl<IConnectionProfileFilter2,IConnectionProfileFilter2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConnectionProfileFilter2?> =
        arrayOfNulls<IConnectionProfileFilter2_Impl>(size) as Array<IConnectionProfileFilter2?>
  }
}
