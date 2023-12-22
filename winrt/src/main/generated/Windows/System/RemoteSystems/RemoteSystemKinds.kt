package Windows.System.RemoteSystems

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RemoteSystemKinds.ABI::class)
@WinRTByReference(brClass = RemoteSystemKinds.ByReference::class)
public class RemoteSystemKinds(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemKinds> {
    public override fun getValue() = RemoteSystemKinds(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemKinds): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemKinds, MemoryAddress> {
    public val IRemoteSystemKindStatics_Instance: IRemoteSystemKindStatics by lazy {
      createIRemoteSystemKindStatics()
    }


    public val IRemoteSystemKindStatics2_Instance: IRemoteSystemKindStatics2 by lazy {
      createIRemoteSystemKindStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRemoteSystemKindStatics(): IRemoteSystemKindStatics {
      val refiid = Guid.REFIID(IRemoteSystemKindStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteSystems.RemoteSystemKinds".toHandle(),refiid,interfacePtr)
      val result = IRemoteSystemKindStatics.ABI.makeIRemoteSystemKindStatics(interfacePtr.value)
      return result
    }

    public fun createIRemoteSystemKindStatics2(): IRemoteSystemKindStatics2 {
      val refiid = Guid.REFIID(IRemoteSystemKindStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteSystems.RemoteSystemKinds".toHandle(),refiid,interfacePtr)
      val result = IRemoteSystemKindStatics2.ABI.makeIRemoteSystemKindStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RemoteSystemKinds {
      val address = segment.toRawLongValue()
      return RemoteSystemKinds(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemKinds): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Phone() = ABI.IRemoteSystemKindStatics_Instance.get_Phone()

    public fun get_Hub() = ABI.IRemoteSystemKindStatics_Instance.get_Hub()

    public fun get_Holographic() = ABI.IRemoteSystemKindStatics_Instance.get_Holographic()

    public fun get_Desktop() = ABI.IRemoteSystemKindStatics_Instance.get_Desktop()

    public fun get_Xbox() = ABI.IRemoteSystemKindStatics_Instance.get_Xbox()

    public fun get_Iot() = ABI.IRemoteSystemKindStatics2_Instance.get_Iot()

    public fun get_Tablet() = ABI.IRemoteSystemKindStatics2_Instance.get_Tablet()

    public fun get_Laptop() = ABI.IRemoteSystemKindStatics2_Instance.get_Laptop()
  }
}
