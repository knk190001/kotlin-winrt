package Windows.Graphics.Printing3D

import Windows.Graphics.Printing3D.IPrinting3DColorMaterialGroupFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Printing3DColorMaterialGroup.ABI::class)
@Signature("rc(Windows.Graphics.Printing3D.Printing3DColorMaterialGroup;{001a6bd0-aadf-4226-afe9-f369a0b45004})")
@WinRTByReference(brClass = Printing3DColorMaterialGroup.ByReference::class)
public class Printing3DColorMaterialGroup(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrinting3DColorMaterialGroup.WithDefault, IWinRTObject {
  private val __625701894_Interface: IPrinting3DColorMaterialGroup.WithDefault by lazy {
    as_625701894()
  }


  public override val __625701894_Ptr: JNAPointer? by lazy {
    __625701894_Interface.__625701894_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__625701894_Interface)

  public constructor(MaterialGroupId: WinDef.UINT) : this(ABI.activate(MaterialGroupId))

  private fun as_625701894(): IPrinting3DColorMaterialGroup.WithDefault {
    if(pointer == NULL) {
      return(IPrinting3DColorMaterialGroup.ABI.makeIPrinting3DColorMaterialGroup(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrinting3DColorMaterialGroup>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrinting3DColorMaterialGroup.ABI.makeIPrinting3DColorMaterialGroup(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Printing3DColorMaterialGroup> {
    public override fun getValue() = Printing3DColorMaterialGroup(pointer.getPointer(0))

    public fun setValue(value: Printing3DColorMaterialGroup): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Printing3DColorMaterialGroup, MemoryAddress> {
    public val IPrinting3DColorMaterialGroupFactory_Instance: IPrinting3DColorMaterialGroupFactory
        by lazy {
      createIPrinting3DColorMaterialGroupFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPrinting3DColorMaterialGroupFactory(): IPrinting3DColorMaterialGroupFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing3D.Printing3DColorMaterialGroup".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPrinting3DColorMaterialGroupFactory.ABI.makeIPrinting3DColorMaterialGroupFactory(factoryActivatorPtr.value))
    }

    public fun activate(MaterialGroupId: WinDef.UINT): JNAPointer? =
        IPrinting3DColorMaterialGroupFactory_Instance.Create(MaterialGroupId)?.pointer

    public override fun fromNative(segment: MemoryAddress): Printing3DColorMaterialGroup {
      val address = segment.toRawLongValue()
      return Printing3DColorMaterialGroup(Pointer(address))
    }

    public override fun toNative(obj: Printing3DColorMaterialGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
