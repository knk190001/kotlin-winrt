package Windows.Services.Cortana

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICortanaPermissionsManager.ABI::class)
@Signature("{191330e0-8695-438a-9545-3da4e822ddb4}")
@Guid("191330e08695438a95453da4e822ddb4")
@WinRTInterface("191330e08695438a95453da4e822ddb4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICortanaPermissionsManager.ByReference::class)
public interface ICortanaPermissionsManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsSupported(): Boolean

  @InterfaceMethod(1)
  public fun ArePermissionsGrantedAsync(permissions: IIterable<CortanaPermission?>?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(2)
  public fun GrantPermissionsAsync(permissions: IIterable<CortanaPermission?>?):
      IAsyncOperation<CortanaPermissionsChangeResult?>?

  @InterfaceMethod(3)
  public fun RevokePermissionsAsync(permissions: IIterable<CortanaPermission?>?):
      IAsyncOperation<CortanaPermissionsChangeResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICortanaPermissionsManager> {
    public override fun getValue() = ABI.makeICortanaPermissionsManager(pointer.getPointer(0))

    public fun setValue(value: ICortanaPermissionsManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICortanaPermissionsManager {
    public val __789771513_Ptr: Pointer?

    public val _789771513_VtblPtr: Pointer?
      get() = __789771513_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsSupported(): Boolean {
      val fnPtr = _789771513_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__789771513_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun ArePermissionsGrantedAsync(permissions: IIterable<CortanaPermission?>?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _789771513_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__789771513_Ptr, marshalToNative(permissions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GrantPermissionsAsync(permissions: IIterable<CortanaPermission?>?):
        IAsyncOperation<CortanaPermissionsChangeResult?>? {
      val fnPtr = _789771513_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CortanaPermissionsChangeResult?>>()
      val hr = fn.invokeHR(arrayOf(__789771513_Ptr, marshalToNative(permissions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CortanaPermissionsChangeResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RevokePermissionsAsync(permissions: IIterable<CortanaPermission?>?):
        IAsyncOperation<CortanaPermissionsChangeResult?>? {
      val fnPtr = _789771513_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CortanaPermissionsChangeResult?>>()
      val hr = fn.invokeHR(arrayOf(__789771513_Ptr, marshalToNative(permissions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CortanaPermissionsChangeResult?>>(result.getValue())
      return resultValue
    }
  }

  public class ICortanaPermissionsManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __789771513_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICortanaPermissionsManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("191330e08695438a95453da4e822ddb4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICortanaPermissionsManager(ptr: Pointer?): WithDefault =
        ICortanaPermissionsManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICortanaPermissionsManager {
      val address = segment.toRawLongValue()
      return makeICortanaPermissionsManager(Pointer(address))
    }

    public override fun toNative(obj: ICortanaPermissionsManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__789771513_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICortanaPermissionsManager):
        Array<ICortanaPermissionsManager?> = (elements as
        Array<ICortanaPermissionsManager?>).castToImpl<ICortanaPermissionsManager,ICortanaPermissionsManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICortanaPermissionsManager?> =
        arrayOfNulls<ICortanaPermissionsManager_Impl>(size) as Array<ICortanaPermissionsManager?>
  }
}
