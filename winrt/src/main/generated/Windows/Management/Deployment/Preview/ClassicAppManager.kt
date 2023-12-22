package Windows.Management.Deployment.Preview

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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ClassicAppManager.ABI::class)
@WinRTByReference(brClass = ClassicAppManager.ByReference::class)
public class ClassicAppManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ClassicAppManager> {
    public override fun getValue() = ClassicAppManager(pointer.getPointer(0))

    public fun setValue(value: ClassicAppManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ClassicAppManager, MemoryAddress> {
    public val IClassicAppManagerStatics_Instance: IClassicAppManagerStatics by lazy {
      createIClassicAppManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIClassicAppManagerStatics(): IClassicAppManagerStatics {
      val refiid = Guid.REFIID(IClassicAppManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Management.Deployment.Preview.ClassicAppManager".toHandle(),refiid,interfacePtr)
      val result = IClassicAppManagerStatics.ABI.makeIClassicAppManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ClassicAppManager {
      val address = segment.toRawLongValue()
      return ClassicAppManager(Pointer(address))
    }

    public override fun toNative(obj: ClassicAppManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FindInstalledApp(appUninstallKey: String) =
        ABI.IClassicAppManagerStatics_Instance.FindInstalledApp(appUninstallKey)
  }
}
