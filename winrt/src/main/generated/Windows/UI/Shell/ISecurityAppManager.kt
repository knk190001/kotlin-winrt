package Windows.UI.Shell

import Windows.Foundation.Uri
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

@ABIMarker(ISecurityAppManager.ABI::class)
@Signature("{96ac500c-aed4-561d-bde8-953520343a2d}")
@Guid("96ac500caed4561dbde8953520343a2d")
@WinRTInterface("96ac500caed4561dbde8953520343a2d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISecurityAppManager.ByReference::class)
public interface ISecurityAppManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Register(
    kind: SecurityAppKind?,
    displayName: String?,
    detailsUri: Uri?,
    registerPerUser: Boolean
  ): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun Unregister(kind: SecurityAppKind?,
      guidRegistration: com.sun.jna.platform.win32.Guid.GUID?): Unit

  @InterfaceMethod(2)
  public fun UpdateState(
    kind: SecurityAppKind?,
    guidRegistration: com.sun.jna.platform.win32.Guid.GUID?,
    state: SecurityAppState?,
    substatus: SecurityAppSubstatus?,
    detailsUri: Uri?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISecurityAppManager> {
    public override fun getValue() = ABI.makeISecurityAppManager(pointer.getPointer(0))

    public fun setValue(value: ISecurityAppManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISecurityAppManager {
    public val __1987498708_Ptr: Pointer?

    public val _1987498708_VtblPtr: Pointer?
      get() = __1987498708_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Register(
      kind: SecurityAppKind?,
      displayName: String?,
      detailsUri: Uri?,
      registerPerUser: Boolean
    ): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1987498708_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1987498708_Ptr, marshalToNative(kind),
          marshalToNative(displayName), marshalToNative(detailsUri), registerPerUser, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Unregister(kind: SecurityAppKind?,
        guidRegistration: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _1987498708_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1987498708_Ptr, marshalToNative(kind),
          marshalToNative(guidRegistration),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun UpdateState(
      kind: SecurityAppKind?,
      guidRegistration: com.sun.jna.platform.win32.Guid.GUID?,
      state: SecurityAppState?,
      substatus: SecurityAppSubstatus?,
      detailsUri: Uri?
    ): Unit {
      val fnPtr = _1987498708_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1987498708_Ptr, marshalToNative(kind),
          marshalToNative(guidRegistration), marshalToNative(state), marshalToNative(substatus),
          marshalToNative(detailsUri),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISecurityAppManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1987498708_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISecurityAppManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("96ac500caed4561dbde8953520343a2d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISecurityAppManager(ptr: Pointer?): WithDefault = ISecurityAppManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISecurityAppManager {
      val address = segment.toRawLongValue()
      return makeISecurityAppManager(Pointer(address))
    }

    public override fun toNative(obj: ISecurityAppManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1987498708_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISecurityAppManager): Array<ISecurityAppManager?> =
        (elements as
        Array<ISecurityAppManager?>).castToImpl<ISecurityAppManager,ISecurityAppManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISecurityAppManager?> =
        arrayOfNulls<ISecurityAppManager_Impl>(size) as Array<ISecurityAppManager?>
  }
}
