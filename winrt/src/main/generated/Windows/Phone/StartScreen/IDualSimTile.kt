package Windows.Phone.StartScreen

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDualSimTile.ABI::class)
@Signature("{143ab213-d05f-4041-a18c-3e3fcb75b41e}")
@Guid("143ab213d05f4041a18c3e3fcb75b41e")
@WinRTInterface("143ab213d05f4041a18c3e3fcb75b41e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDualSimTile.ByReference::class)
public interface IDualSimTile : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_DisplayName(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_DisplayName(): String?

  @InterfaceMethod(2)
  public fun get_IsPinnedToStart(): Boolean

  @InterfaceMethod(3)
  public fun CreateAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(4)
  public fun UpdateAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(5)
  public fun DeleteAsync(): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDualSimTile> {
    public override fun getValue() = ABI.makeIDualSimTile(pointer.getPointer(0))

    public fun setValue(value: IDualSimTile_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDualSimTile {
    public val __1944772451_Ptr: Pointer?

    public val _1944772451_VtblPtr: Pointer?
      get() = __1944772451_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_DisplayName(value: String?): Unit {
      val fnPtr = _1944772451_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1944772451_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1944772451_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1944772451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsPinnedToStart(): Boolean {
      val fnPtr = _1944772451_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1944772451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun CreateAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1944772451_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1944772451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun UpdateAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1944772451_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1944772451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun DeleteAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1944772451_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1944772451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IDualSimTile_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1944772451_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDualSimTile, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("143ab213d05f4041a18c3e3fcb75b41e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDualSimTile(ptr: Pointer?): WithDefault = IDualSimTile_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDualSimTile {
      val address = segment.toRawLongValue()
      return makeIDualSimTile(Pointer(address))
    }

    public override fun toNative(obj: IDualSimTile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1944772451_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDualSimTile): Array<IDualSimTile?> = (elements as
        Array<IDualSimTile?>).castToImpl<IDualSimTile,IDualSimTile_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDualSimTile?> =
        arrayOfNulls<IDualSimTile_Impl>(size) as Array<IDualSimTile?>
  }
}
